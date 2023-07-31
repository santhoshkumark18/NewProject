package org.Aug04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class PolicyBazzar {
    public static void main(String[] args) {
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.policybazaar.com/");
        List<WebElement> lst = driver.findElements(By.xpath("//h3[@class=\"ruby-list-heading\"]/following-sibling::ul/li/a/span[@itemprop=\"name\"]"));
        System.out.println(lst.size());
        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        WebElement element = driver.findElement(By.xpath("\"//li[@class=\\\"ruby-menu-mega shade mr\\\"]/a"));
        Actions actions = new Actions(driver);
        actions.moveToElement(element).perform();
        System.out.println(lst.get(1).getText());
        for (int i = 0; i < lst.size(); i++) {
            System.out.println(lst.get(i).getText());
        }
    }
}
