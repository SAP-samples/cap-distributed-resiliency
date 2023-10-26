package com.msft.sap.performance.test.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Properties;

import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.CommandLineParser;
import org.apache.commons.cli.DefaultParser;
import org.apache.commons.cli.HelpFormatter;
import org.apache.commons.cli.Option;
import org.apache.commons.cli.Options;
import org.apache.commons.cli.ParseException;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.javaprop.JavaPropsMapper;

public class JsonToProperties {

  private String fileToString(String fileName) {
    try {
      FileInputStream fis = new FileInputStream(fileName);
      byte[] buffer = new byte[10];
      StringBuilder sb = new StringBuilder();
      while (fis.read(buffer) != -1) {
        sb.append(new String(buffer));
        buffer = new byte[10];
      }
      fis.close();

      return sb.toString();
    } catch (Exception ex) {
      return "";
    }
  }

  private void jsonToProperties(String jsonFile, String outputPropertiesFile) {
    try {
      ObjectMapper om = new ObjectMapper();
      Object host = om.readValue(fileToString(jsonFile), Object.class);
      JavaPropsMapper mapper = new JavaPropsMapper();
      Properties props = mapper.writeValueAsProperties(host);
      props.store(new FileOutputStream(new File(outputPropertiesFile)), "");
    } catch (Exception ex) {
      ex.printStackTrace();
    }
  }

  private static Options createOptions() {
    Options options = new Options();
    Option helpOpt = Option.builder("help").hasArg(false).desc("Help and show parameters").build();
    options.addOption(helpOpt);

    Option json = Option.builder("j").longOpt("jsonFile").argName("jsonFile").hasArg(true)
        .required(true)
        .desc("JSON File")
        .build();
    options.addOption(json);
    Option properties = Option.builder("p").longOpt("propertiesFile").argName("propertiesFile").hasArg(true)
        .required(true)
        .desc("Properties File")
        .build();
    options.addOption(properties);
    return options;
  }

  public static void main(String[] args) {
    CommandLineParser parser = new DefaultParser();
    Options options = createOptions();
    HelpFormatter helper = new HelpFormatter();
    try {
      CommandLine line = parser.parse(options, args);
      String jsonFile = line.getOptionValue("jsonFile");
      String propertiesFile = line.getOptionValue("propertiesFile");
      JsonToProperties parameterConfig = new JsonToProperties();
      parameterConfig.jsonToProperties(jsonFile, propertiesFile);
    } catch (ParseException ex) {
      System.out.println(ex.getMessage());
      helper.printHelp(
          "java -jar test-configurator-with-dependencies.jar -j <json file> -p <properties file> ",
          options);
      System.exit(0);
    }
  }
}
