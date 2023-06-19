package org.TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

public class event {
    public void test() {

        ChromeDriver driver = new ChromeDriver();
        EventFiringWebDriver eDriver = new EventFiringWebDriver(driver);
        Listen obj = new Listen();


    }
}
