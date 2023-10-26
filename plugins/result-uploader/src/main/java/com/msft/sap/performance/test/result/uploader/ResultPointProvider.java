package com.msft.sap.performance.test.result.uploader;

import java.util.HashMap;

import com.msft.sap.performance.test.result.uploader.config.Measurement;
import lombok.Getter;
import lombok.Setter;

import com.influxdb.client.domain.WritePrecision;
import com.influxdb.client.write.Point;

@Getter
@Setter
public class ResultPointProvider {
    private String region;
    private String type;
    private String subType;
    private String executionDate;
    private String scenario;
    private String subScenario;
    private String connectionType;
    private String btpLocation;
    private String s4hLocation;
    private String sccLocation;
    private String userLocation;

    private long timeStamp;
    private long time;
    private String label;
    private String responseCode;
    private String threadName;
    private String dataType;
    private long errorCount;
    private String assertionFailure;
    private long receivedBytes;
    private long sentBytes;
    private long grpThreads;
    private long allThreads;
    private long latency;
    private long connectTime;
    
    private HashMap<String, Object> statisticsMap = null;

    public void addCommonTag(Point point) {
        point.addTag(Measurement.Common.Tags.REGION, this.getRegion())
                .addTag(Measurement.Common.Tags.TYPE, this.getType())
                .addTag(Measurement.Common.Tags.SUB_TYPE, this.getSubType())
                .addTag(Measurement.Common.Tags.EXECUTION_DATE, this.getExecutionDate())
                .addTag(Measurement.Common.Tags.SCENARIO, this.getScenario())
                .addTag(Measurement.Common.Tags.SUB_SCENARIO, this.getSubScenario())
                .addTag(Measurement.Common.Tags.CONNECTION_TYPE, this.getConnectionType())
                .addTag(Measurement.Common.Tags.BTP_LOCATION, this.getBtpLocation())
                .addTag(Measurement.Common.Tags.S4H_LOCATION, this.getS4hLocation())
                .addTag(Measurement.Common.Tags.SCC_LOCATION, this.getSccLocation())
                .addTag(Measurement.Common.Tags.USER_LOCATION, this.getUserLocation());
    }

    public Point getDefaultPoint() {
        Point point = Point.measurement(Measurement.Request.NAME).time(this.getTimeStamp(),
                WritePrecision.NS);
        addCommonTag(point);
        point.addTag(Measurement.Request.Tags.REQUEST_NAME, this.getLabel())
                .addTag(Measurement.Request.Tags.RESULT_CODE, this.getResponseCode())
                .addTag(Measurement.Request.Tags.ERROR_MSG, this.getAssertionFailure())
                .addTag(Measurement.Request.Tags.THREAD_NAME, this.getThreadName())
                .addTag(Measurement.Request.Tags.DATA_TYPE ,this.getDataType()) 
                .addField(Measurement.Request.Fields.ERROR_COUNT, this.getErrorCount())
                .addField(Measurement.Request.Fields.RECEIVED_BYTES, this.getReceivedBytes())
                .addField(Measurement.Request.Fields.SENT_BYTES, this.getSentBytes())
                .addField(Measurement.Request.Fields.RESPONSE_TIME, this.getTime())
                .addField(Measurement.Request.Fields.GRP_THREADS, this.grpThreads)
                .addField(Measurement.Request.Fields.ALL_THREADS, this.allThreads)
                .addField(Measurement.Request.Fields.LATENCY, this.getLatency())
                .addField(Measurement.Request.Fields.CONNECT_TIME, this.getConnectTime())
                .addField(Measurement.Request.Fields.PROCESSING_TIME, this.getLatency() - this.getConnectTime())
                .addFields(this.getStatisticsMap());
        if (this.getErrorCount() == 0) {
            point.addTag(Measurement.Request.Tags.RESULT, "pass");
        } else {
            point.addTag(Measurement.Request.Tags.RESULT, "fail");
        }
        return point;
    }

    public Point getTestStart() {
        Point point = Point.measurement(Measurement.StartEnd.NAME)
                .time(this.getTimeStamp(), WritePrecision.MS);
        addCommonTag(point);
        point.addTag(Measurement.StartEnd.Tags.TYPE, Measurement.StartEnd.Values.STARTED)
                .addField(Measurement.StartEnd.Fields.PLACEHOLDER, "1");
        return point;
    }

    public Point getTestEnd() {
        Point point = Point.measurement(Measurement.StartEnd.NAME)
                .time(this.getTimeStamp(), WritePrecision.MS);
        addCommonTag(point);
        point.addTag(Measurement.StartEnd.Tags.TYPE, Measurement.StartEnd.Values.FINISHED)
                .addField(Measurement.StartEnd.Fields.PLACEHOLDER, "1");
        return point;
    }
}