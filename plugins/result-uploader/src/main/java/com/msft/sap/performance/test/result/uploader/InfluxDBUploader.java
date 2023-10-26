package com.msft.sap.performance.test.result.uploader;
import org.apache.commons.cli.*;
public class InfluxDBUploader {

    public static void main(String[] args) {
        CommandLineParser parser = new DefaultParser();
        Options options = createOptions();
        HelpFormatter helper = new HelpFormatter();
        try {
            CommandLine line = parser.parse(options, args);
            String csvFile = line.getOptionValue("csv");
            String propertiesFile = line.getOptionValue("properties");
            String dateTime = line.getOptionValue("datetime");                 

            CSVFileProcessor csvFileProcessor = new CSVFileProcessor();
            csvFileProcessor.initProperties(propertiesFile);
            csvFileProcessor.importCsv(csvFile, dateTime);
        } catch (ParseException ex) {
            System.out.println(ex.getMessage());
            helper.printHelp(
                    "java -jar result-upload.jar -c <csv file> -p <properties file> ",
                    options);
            System.exit(0);
        }
    }

    private static Options createOptions() {
        Options options = new Options();
        Option helpOpt = Option.builder("help").hasArg(false).desc("Help and show parameters").build();
        options.addOption(helpOpt);
        Option folder = Option.builder("c").longOpt("csv").argName("csv").hasArg(true)
                .required(true)
                .desc("CSV File")
                .build();
        options.addOption(folder);

         Option propertiesFile = Option.builder("p").longOpt("properties").argName("properties").hasArg(true)
                .required(true)
                .desc("Properties File")
                .build();
        options.addOption(propertiesFile);

        Option dateTime = Option.builder("dt").longOpt("datetime").argName("datetime").hasArg(true)
                .required(true)
                .desc("Execution date and time")
                .build();
        options.addOption(dateTime);
        
        return options;
    }

}
