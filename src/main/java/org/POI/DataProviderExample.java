package org.POI;

import org.TestNG.DataUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class DataProviderExample {

    @Test(dataProvider = "getData",dataProviderClass = DataUtils.class)
    public void data(String exceldata[]) {
        FirefoxDriver driver = new FirefoxDriver();
        System.out.println(exceldata[0] + " " + exceldata[1]);
        driver.get("https://letcode.in/");
        driver.findElement(By.linkText("Log in")).click();
        driver.findElement(By.name("email"))
                .sendKeys(exceldata[0]);
        driver.findElement(By.name("password")).sendKeys(exceldata[1]);
        driver.findElement(By.xpath("//button[.='LOGIN']")).click();
        String title = driver.getTitle();
        System.out.println("Title is " + title);
        driver.quit();
    }

}
