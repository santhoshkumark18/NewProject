package org.ExtendReport;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class pro {
    public static void main(String[] args) throws IOException {
        Properties properties = new Properties();
        properties.load(new FileInputStream("C:\\Projects\\SampleSelenium\\target\\newData.properties"));
        System.out.println(properties.getProperty("name"));
        System.out.println(properties.getProperty("age"));
    }
}
