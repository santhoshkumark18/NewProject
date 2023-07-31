package org.July04.TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossBrowser {
    WebDriver driver;
    @Parameters({"browser","email","pass"})
    @Test
    public void letCode(String bro,String email,String pass) {

        switch (bro) {
            case "chrome":
                driver= new ChromeDriver();
                break;
            case "edge":
                driver= new EdgeDriver();
                break;
            default:
                System.out.println("choose the correct driver");
        }
        System.out.println(email);
        System.out.println(pass);
        driver.quit();
    }
}
