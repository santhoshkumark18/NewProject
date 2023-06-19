package org.June17.JavaAndSelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigation {
    public static void main(String[] args) {
        ChromeDriver driver = new ChromeDriver();
        driver.navigate().back();
        driver.navigate().forward();
        driver.navigate().refresh();

    }
}
