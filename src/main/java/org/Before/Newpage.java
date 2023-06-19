package org.Before;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Properties;

public class Newpage {
    ChromeDriver driver;
    @BeforeSuite
    public void setupDriver() throws IOException {
      driver  = new ChromeDriver();
        Properties properties = new Properties();
        properties.load(new FileInputStream("C:\\Projects\\SampleSelenium\\src\\main\\java\\org\\Before\\config.properties"));
    }
    @AfterSuite
    public void tearDown() {
        driver.quit();
    }
}
