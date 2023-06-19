package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class Radio {
    public static void main(String[] args) {
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.letcode.in");
        driver.manage().window().maximize();
        driver.get("https://www.letcode.in/windows");
        //Simple
        driver.findElement(By.id("home")).click();
        Set<String> win=driver.getWindowHandles();
        List<String> lst = new ArrayList<>(win);
        for(String s: win) {
            System.out.println(s);
        }
        driver.switchTo().window(lst.get(0));
        System.out.println(driver.getTitle());
        driver.switchTo().window(lst.get(1));
        System.out.println(driver.getTitle());

        driver.quit();
    }
}
