package org.Selenium;

import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.asserts.Assertion;
import org.testng.asserts.SoftAssert;

public class ZigWheels {
    public static void main(String[] args) {
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.zigwheels.com");
        System.out.println(driver.getTitle());
        Assertion assertion = new Assertion();
        assertion.assertEquals(driver.getTitle(),"New Cars & Bikes, Prices, News, Reviews,ZigWheels.com");
        System.out.println("hi");
        driver.quit();
    }
}
