package org.June17.TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossBrowserTesting {
    WebDriver driver;
    @Parameters({"browser"})
    @Test
    public void googleSearch(String browser) {
        switch (browser) {
            case "chrome":
                driver = new ChromeDriver();
                break;
            case "edge":
                driver = new EdgeDriver();
                break;
            default:
                System.out.println("choose correct browser");
        }
        driver.get("https://www.google.com");
        System.out.println("email");
        System.out.println("pass");
    }
}
