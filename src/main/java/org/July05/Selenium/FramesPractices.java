package org.July05.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FramesPractices {
    public static void main(String[] args) {
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://letcode.in/frame");
        driver.findElement(By.name("fname")).sendKeys("lakshmi");





    }
}
