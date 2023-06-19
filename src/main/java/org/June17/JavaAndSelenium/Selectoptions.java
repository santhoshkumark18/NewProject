package org.June17.JavaAndSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class Selectoptions {
    public static void main(String[] args) {
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.letcode.in/windows");
        driver.findElement(By.id("home")).click();
       Set<String> set = driver.getWindowHandles();
       List<String> lst = new ArrayList<>(set);
        System.out.println(lst.get(0));
        System.out.println(lst.get(1));
        System.out.println(driver.getWindowHandle());
        driver.switchTo().window(driver.getWindowHandle());
        JavascriptExecutor javascriptExecutor = (JavascriptExecutor) driver;
        javascriptExecutor.executeScript("arguments[0].click();");
        /*javascriptExecutor.executeScript("arguments[].value('santhosh')",WebElement);*/
        javascriptExecutor.executeScript("window.scrollBy(0,3000)");
        javascriptExecutor.executeScript("arguments[].scrollIntoView();",new Object());
    }
}
