package org.TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.InvalidSelectorException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class google {

    @Test(threadPoolSize = 2,invocationCount = 1,groups = "smoke",expectedExceptions = InvalidSelectorException.class)
    public void openURL() {
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://letcode.in/");
        driver.findElement(By.xpath("//*[@id=\"navbar-menu\"]/div[2]/div/div/a[]")).click();
        driver.findElement(By.name("email")).sendKeys("santhoshinrellife@gmail.com");
        driver.findElement(By.name("password")).sendKeys("Santhosh@18");
        driver.findElement(By.xpath("/html/body/app-root/app-signin/div/div/div/div/form/div[3]/p/button")).click();
        driver.quit();
    }
    @Test(threadPoolSize = 2,invocationCount = 4,groups = "sanity")
    public void closeUrl() {
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://letcode.in/");
        driver.findElement(By.xpath("//*[@id=\"navbar-menu\"]/div[2]/div/div/a[2]")).click();
        driver.findElement(By.name("email")).sendKeys("santhoshinrellife@gmail.com");
        driver.findElement(By.name("password")).sendKeys("Santhosh@18");
        driver.findElement(By.xpath("/html/body/app-root/app-signin/div/div/div/div/form/div[3]/p/button")).click();
        driver.quit();
    }
}
