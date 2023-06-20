package org.June19.TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Test2 {
    ChromeDriver driver;
    @Test(threadPoolSize = 3,invocationCount = 2)
    public void test() {
       /* driver = new ChromeDriver();
        driver.get("https://www.google.com");
        driver.findElement(By.id("nvm"));
        System.out.println(driver.getTitle());*/
        throw new NoSuchElementException("no");
    }
    @Test(dependsOnMethods = {"test"})
    public void test2() {
        System.out.println("Hi");
    }
}
