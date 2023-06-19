package org.TestNGTwo;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class DataProvider {
    @Test(dataProvider = "getData",dataProviderClass = DataUtils.class)
    public  void data(String email,String pass) {
        ChromeDriver driver=new ChromeDriver();
        System.out.println(email + " " + pass);
        driver.get("https://letcode.in/");
        driver.findElement(By.linkText("Log in")).click();
        driver.findElement(By.name("email"))
                .sendKeys(email);
        driver.findElement(By.name("password")).sendKeys(pass);
        driver.findElement(By.xpath("//button[.='LOGIN']")).click();
        String title = driver.getTitle();
        System.out.println("Title is " + title);
        driver.quit();
    }
}
