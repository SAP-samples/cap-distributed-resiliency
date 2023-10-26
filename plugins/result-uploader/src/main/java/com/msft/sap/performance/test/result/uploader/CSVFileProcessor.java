package com.msft.sap.performance.test.result.uploader;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.InputStream;
import java.io.Reader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.TimeZone;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import org.apache.commons.lang3.math.NumberUtils;

import com.influxdb.client.InfluxDBClient;
import com.influxdb.client.InfluxDBClientFactory;
import com.influxdb.client.WriteApiBlocking;
import com.influxdb.client.write.Point;

public class CSVFileProcessor {
    private static final char delimiter = ',';   
    private static final int ONE_MS_IN_NANOSECONDS = 1000000;
    private InfluxDBClient influxDBClient;
    private WriteApiBlocking writeApi;
    private Properties properties = null;

    public void importCsv(String resultFile,String dateTime) {
        ResultPointProvider resultPointProvider = null;
        try {
            this.writeApi = getInfluxDBClient().getWriteApiBlocking();
            resultPointProvider = new ResultPointProvider();
            resultPointProvider.setExecutionDate(dateTime);
            resultPointProvider.setRegion(replaceNull(getProperty("Region")));
            resultPointProvider.setType(replaceNull(getProperty("Type")));
            resultPointProvider.setSubType(replaceNull(getProperty("SubType")));
            resultPointProvider.setScenario(replaceNull(getProperty("Scenario")));
            resultPointProvider.setSubScenario(replaceNull(getProperty("subScenario")));
            resultPointProvider.setConnectionType(replaceNull(getProperty("ConnectionType")));
            resultPointProvider.setBtpLocation(replaceNull(getProperty("BTPHost_Name")));
            resultPointProvider.setS4hLocation(replaceNull(getProperty("S4HHost_Name")));
            resultPointProvider.setSccLocation(replaceNull(getProperty("SCCHost_Name")));

            Reader in = new FileReader(resultFile);
            Iterable<CSVRecord> records = CSVFormat.RFC4180.withFirstRecordAsHeader().withDelimiter(delimiter)
                    .parse(in);
            List<Point> points = Collections.synchronizedList(new ArrayList<>());
            boolean isStartPointAdded = false;
            Long timeToset = Long.parseLong("1673721000000");
            for (CSVRecord record : records) {
                Map<String, String> recordMap = record.toMap();
                resultPointProvider.setUserLocation(replaceNull(recordMap.get("UserHost_Name")));
                timeToset = Long.parseLong(replaceNumericNull(recordMap.get("timeStamp")));
                resultPointProvider.setTimeStamp(timeToset);
                if (!isStartPointAdded) {
                    points.add(resultPointProvider.getTestStart());
                    isStartPointAdded = true;
                }
                resultPointProvider.setTime(Long.parseLong(replaceNumericNull(recordMap.get("elapsed"))));           
                resultPointProvider.setLabel(replaceNull(recordMap.get("label")));
                resultPointProvider.setResponseCode(replaceNull(recordMap.get("responseCode")));
                
                resultPointProvider.setThreadName(replaceNull(recordMap.get("threadName")));
                resultPointProvider.setDataType(replaceNull(recordMap.get("dataType")));
                
                String value = replaceNull(recordMap.get("success"));
                if (value.equals("true")) {
                    resultPointProvider.setErrorCount(0);
                } else {
                    resultPointProvider.setErrorCount(1);
                }
                resultPointProvider.setAssertionFailure(replaceNull(recordMap.get("failureMessage")));
                resultPointProvider.setReceivedBytes(Long.parseLong(replaceNumericNull(recordMap.get("bytes"))));
                resultPointProvider.setSentBytes(Long.parseLong(replaceNumericNull(recordMap.get("sentBytes"))));
                resultPointProvider.setGrpThreads(Integer.parseInt(replaceNumericNull(recordMap.get("grpThreads"))));            
                resultPointProvider.setAllThreads(Long.parseLong(replaceNumericNull(recordMap.get("allThreads"))));
                resultPointProvider.setLatency(Long.parseLong(replaceNumericNull(recordMap.get("Latency"))));
                resultPointProvider.setConnectTime(Long.parseLong(replaceNumericNull(recordMap.get("Connect"))));
                resultPointProvider.setStatisticsMap(getSampleVariables(recordMap));
                resultPointProvider.setTimeStamp(timeToset * ONE_MS_IN_NANOSECONDS);                
                points.add(resultPointProvider.getDefaultPoint());
                if (points.size() > 1000) {
                    this.writeApi.writePoints(points);
                    points.clear();
                }
            }
            resultPointProvider.setTimeStamp(timeToset);
            points.add(resultPointProvider.getTestEnd());
            this.writeApi.writePoints(points);
            getInfluxDBClient().close();
            influxDBClient = null;
        } catch (Exception ex) {
            System.out.println("Failed to process JMeter CSV File: " + ex.getMessage());
        }
    }

    public String getProperty(String property) {
        return properties.getProperty(property);
    }

    public void initProperties(String propertyFile) {
        try {
            properties = new Properties();
            InputStream inputStream = new FileInputStream(propertyFile);
            properties.load(inputStream);
            inputStream.close();
        } catch (Exception ex) {
            System.out.println("Failed to read the property: " + ex.getMessage());
        }
    }

    public InfluxDBClient getInfluxDBClient() {
        if (influxDBClient == null) {
            try {
                influxDBClient = InfluxDBClientFactory.create(getProperty("DBConfig_Url"),
                        getProperty("DBConfig_Token").toCharArray(), getProperty("DBConfig_Organization"),
                        getProperty("DBConfig_Bucket"));
                influxDBClient.enableGzip();
            } catch (Exception ex) {
                System.out.println("Failed to create InfluxDBClient: " + ex.getMessage());
            }
        }
        return influxDBClient;
    }

    public String getRunId() {
        Date currentDate = new Date();
        DateFormat dateFormat = new SimpleDateFormat("dd-MM-yyHHmmss");
        dateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
        return dateFormat.format(currentDate);
    }

    private HashMap<String, Object> getSampleVariables(Map<String, String> recordMap) {
        HashMap<String, Object> svMap = new HashMap<String, Object>();
        try {
            String sampleVariables = getProperty("sample_variables");
            String[] variableNames = sampleVariables != null ? sampleVariables.split(",") : new String[0];
            for (String header : variableNames) {
                String value = recordMap.get(header);
                if(NumberUtils.isCreatable(value)) {
                    svMap.put(header, Long.parseLong(value));
                }               
            }
        } catch (Exception ex) {
            System.out.println("Failed to get sample variables: " + ex.getMessage());
        }
        return svMap;
    }

    private String replaceNull(String str) {
        return str == null ? "" : str;
    }
    private String replaceNumericNull(String str) {
        if (str == null || str == "") {
            str = "0";
        }
        return str;
    }
}