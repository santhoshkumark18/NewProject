package org.July05.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {
    public static void main(String[] args) {
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://letcode.in/dropdowns");
      WebElement fruits= driver.findElement(By.id("fruits"));
        Select select = new Select(fruits);
        select.selectByVisibleText("Mango");
        select.deselectByVisibleText("Mango");
    }
}
