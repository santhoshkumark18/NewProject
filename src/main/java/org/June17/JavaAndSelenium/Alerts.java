package org.June17.JavaAndSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;

public class Alerts {
    public static void main(String[] args) {
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.letcode.in/alert");
        /*driver.switchTo().frame(0);*/
        driver.findElement(By.id("accept")).click();
        System.out.println(driver.switchTo().alert().getText());
        driver.switchTo().alert().accept();
        driver.findElement(By.id("confirm")).click();
        System.out.println(driver.switchTo().alert().getText());
        driver.switchTo().alert().dismiss();
        driver.findElement(By.id("prompt")).sendKeys("santhosh");
        driver.quit();
        Actions ac = new Actions(driver);

    }
}
