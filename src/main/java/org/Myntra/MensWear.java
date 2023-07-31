package org.Myntra;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.LinkedList;
import java.util.List;

public class MensWear {
    public static void main(String[] args) {
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.myntra.com");
        driver.manage().window().maximize();
        List<WebElement> mensWear = driver.findElements(By.xpath("//a[@class=\"desktop-categoryName\"]"));
        List<String> lstOfMensWear= new LinkedList<>();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[@class=\"desktop-categoryName\"]")));
        for(int i=10;i<=14;i++) {
            System.out.println(mensWear.get(i).getText());
        }
        System.out.println(mensWear.size());
        /*for (String str :
                lstOfMensWear ){
            System.out.println(str);
        }*/
        WebElement element = driver.findElement(By.xpath("(//a[@class=\"desktop-categoryName\"])[14]"));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@class=\\\"desktop-categoryName\\\"]")));
        System.out.println(element.getText());
        driver.close();
    }
}
