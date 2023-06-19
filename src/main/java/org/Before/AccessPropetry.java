package org.Before;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class AccessPropetry {
    @FindBy(id = "name")
    public static WebElement homeclick;

    public void main(String[] args) throws IOException {
        ChromeDriver driver = new ChromeDriver();
        PageFactory.initElements(driver,this);

        Properties properties = new Properties();
        properties.load(new FileInputStream("C:\\Projects\\SampleSelenium\\src\\main\\java\\org\\Before\\Details.properties"));
        System.out.println(properties.getProperty("name"));

   homeclick.click();
    }
}
