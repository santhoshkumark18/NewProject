package org.June21.Cucumber;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class MakeMyTrip {
    public static void main(String[] args) throws InterruptedException {
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.makemytrip.com/");
        driver.findElement(By.xpath("//input[@id='username']")).sendKeys("7358914063");
        driver.findElement(By.xpath("//span[.='Continue']")).click();
        //Thread.sleep(10000);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        //driver.findElement(By.xpath("//input[@id='otp']")).sendKeys("940965");
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='otp']"))).sendKeys("940965");
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@class='capText font16']"))).click();
        //driver.findElement(By.xpath("//button[@class='capText font16']")).click();
        /*driver.switchTo().frame(0);
        driver.findElement(By.xpath("//div[@class='nsm7Bb-HzV7m-LgbsSe-Bz112c']")).click();
        for (String window : driver.getWindowHandles()) {
            driver.switchTo().window(window);
        }
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        driver.findElement(By.xpath("//*[@id=\"identifierId\"]")).sendKeys("santhoshinreallife@gmail.com");
        //executor.executeScript("arguments[0].value='santhoshinreallife@gmail.com';","//*[@id=\"identifierId\"]");
        //email.sendKeys("qea@gml.com");
        driver.findElement(By.xpath("//span[text()='Next']")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);*/
    }
}
