package org.July04.TestNG;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Practice002 {
    @Test(threadPoolSize = 3,invocationCount = 3)
    public void dis() {
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.google.com");
        System.out.println(driver.getTitle());
        driver.quit();
    }
}
