package org.July05.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertsPractices {
    public static void main(String[] args) {
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://letcode.in/alert");
       WebElement acc = driver.findElement(By.id("accept"));
       acc.click();
        System.out.println(driver.switchTo().alert().getText());
       driver.switchTo().alert().accept();
        WebElement confirm = driver.findElement(By.id("confirm"));
        confirm.click();
        System.out.println(driver.switchTo().alert().getText());
        driver.switchTo().alert().dismiss();
        WebElement prompt = driver.findElement(By.id("prompt"));
        prompt.click();
        driver.switchTo().alert().sendKeys("santhoshkumar");
        driver.switchTo().alert().accept();
    }
}
