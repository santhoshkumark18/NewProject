package org.TestNGTwo;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class FirstMethods {
    WebDriver driver;
    @Parameters({"search","webbrowser"})
    @Test(groups = {"smoke"})
    public  void search(String key,String webbrowser) {
        switch (webbrowser) {
            case "chrome":
                driver= new ChromeDriver();
                break;
            case "edge":
                driver= new EdgeDriver();
                break;
            default:
                System.out.println("chosse the correct one");
                break;
        }

        driver.get("https://www.google.com");
        driver.findElement(By.xpath("//*[@id=\"APjFqb\"]")).sendKeys(key, Keys.ENTER);
        System.out.println(driver.getTitle());
        driver.quit();
    }
}
