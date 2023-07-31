package org.example;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class alerts {
    public static void main(String[] args) {
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.letcode.in");
        driver.manage().window().maximize();
        driver.get("https://www.letcode.in/alert");
        //Simple
        driver.findElement(By.id("accept")).click();
        System.out.println(driver.switchTo().alert().getText());
        driver.switchTo().alert().accept();
        //confirm alert

        driver.findElement(By.id("confirm")).click();
        System.out.println(driver.switchTo().alert().getText());
        driver.switchTo().alert().dismiss();
        //prompt alert
        driver.findElement(By.id("prompt")).click();
        driver.switchTo().alert();
        driver.switchTo().alert().sendKeys("santhoshkumar");
        driver.switchTo().alert().accept();
    }
}
