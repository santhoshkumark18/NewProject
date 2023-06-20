package org.June20.TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class paltform {
    WebDriver driver;
    @Parameters({"bro"})
    @Test
    public void run(String browser) {
        switch (browser) {
            case "chrome":
                driver=new ChromeDriver();
                break;
            case "edge":
                driver=new EdgeDriver();
                break;
            default:
                System.out.println("select correct one");
        }
        driver.get("https://www.google.com");
    }


}
