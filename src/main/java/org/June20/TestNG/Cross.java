package org.June20.TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import static java.util.concurrent.TimeUnit.SECONDS;

public class Cross {
    @Parameters({"name","rollno","age"})
    @Test()
    public void params(String name,int rollno,int age) {
        ChromeDriver driver= new ChromeDriver();
      /*  Duration TimeUnit;
        Wait wait = new FluentWait(driver);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("")));*/
        Duration timeout = null;
        Wait wait = new FluentWait(driver)
                .withTimeout(timeout)
                .pollingEvery(timeout)
                .ignoring(Exception.class);

        System.out.println(name);
        System.out.println(rollno);
        System.out.println(age);
    }
}
