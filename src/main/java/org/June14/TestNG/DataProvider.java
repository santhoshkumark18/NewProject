package org.June14.TestNG;

import org.example.Table;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.security.Key;

public class DataProvider {
    @Test(threadPoolSize = 3,invocationCount = 1,dataProvider = "data",dataProviderClass = DataUtils.class)
    public void Google(String data[]) {
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.google.com");
        driver.findElement(By.xpath("//*[@id=\"APjFqb\"]")).sendKeys(data[0], Keys.ENTER);
        driver.quit();
    }
}
