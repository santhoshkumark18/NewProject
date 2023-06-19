package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {
    public static void main(String[] args) {
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.letcode.in");
        driver.manage().window().maximize();
        driver.get("https://www.letcode.in/frame");
        //Simple
        driver.switchTo().frame("firstFr");
        driver.findElement(By.name("fname")).sendKeys("santhosh");

        driver.switchTo().frame(0);
        driver.findElement(By.name("email")).sendKeys("santhsoh@gamil.com");

        driver.switchTo().parentFrame();
        driver.findElement(By.name("lname")).sendKeys("K");

    }
}
