package org.example;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.letcode.in");
        driver.manage().window().maximize();
        driver.get("https://www.letcode.in/dropdowns");
        //Simple

      WebElement ele = driver.findElement(By.id("fruits"));
      Select fruits = new Select(ele);
      //fruits.selectByIndex(1);
        //fruits.selectByVisibleText("Banana");
        WebElement mul = driver.findElement(By.id("superheros"));
        Select superheros= new Select(mul);
        System.out.println(superheros.isMultiple());
        superheros.selectByIndex(1);
        superheros.selectByIndex(2);
        superheros.selectByIndex(3);
        superheros.selectByIndex(4);
        WebElement lastPr=driver.findElement(By.id("lang"));
        Select pro = new Select(lastPr);
        pro.selectByIndex(1);
        List<WebElement> lst = pro.getOptions();
        for(WebElement e:lst) {
            System.out.println(e.getText());
        }
        driver.quit();
    }
}
