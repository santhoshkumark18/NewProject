package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.asserts.Assertion;
import org.testng.asserts.SoftAssert;

import javax.swing.*;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class FramesExamples {
    public static void main(String[] args) {
        ChromeDriver driver = new ChromeDriver();
        WebDriver.Navigation navigation = driver.navigate();
        navigation.to("https://www.jqueryui.com/droppable/");
       /* driver.switchTo().frame(0);
        WebElement src = driver.findElement(By.id("draggable"));
        WebElement dest = driver.findElement(By.id("droppable"));
        Actions ac = new Actions(driver);
        Point p = src.getLocation();
        Point P1 = dest.getLocation();
        ac.dragAndDrop(src,dest).perform();*/
        System.out.println(driver.getTitle());
        Assertion soAssertion = new SoftAssert();
        soAssertion.assertEquals(driver.getTitle(),"Droppable |","not correct");
        System.out.println("hi");
    }
}
