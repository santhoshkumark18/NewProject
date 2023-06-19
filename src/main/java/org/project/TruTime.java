package org.project;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class TruTime {
    By email = By.xpath("//input[@type='email']");
    By next = By.xpath("//input[@type='submit']");
    By pass = By.name("passwd");
    By vald = By.className("table-row");
    By TextOtp = By.xpath("(//div[@class='table-cell text-left content'])[1]");
    By yesClick = By.xpath("//*[@id='idSIButton9']");
    By befYes = By.xpath("//div[@data-value='PhoneAppNotification']");
    By yes = By.xpath("//input[@value='Yes']");

    @Test
    public void signin() throws InterruptedException {
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://be.cognizant.com");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.findElement(email).sendKeys("2269280@cognizant.com");
        driver.findElement(next).click();
        Thread.sleep(2000);
        driver.findElement(pass).sendKeys("Kavitha@1803");
        driver.findElement(next).click();
        Thread.sleep(2000);
        //driver.findElement(befYes).click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"idBtn_Back\"]")));
        driver.findElement(By.xpath("//*[@id=\"idBtn_Back\"]")).click();
        System.out.println(driver.getTitle());
        driver.findElement(By.xpath("//div[@class=\"nvEhuDKzSmREBsqaIaOhu\"]")).click();
        WebElement name = driver.findElement(By.xpath("//div[@id=\"mectrl_currentAccount_primary\"]"));
        WebElement gmail = driver.findElement(By.xpath("//div[@id=\"mectrl_currentAccount_secondary\"]"));
        System.out.println(name.getText());
        System.out.println(gmail.getText());
        Thread.sleep(3000);
        driver.findElement(By.xpath("//div[@title=\"OneCognizant\"]")).click();
        Set<String> windowhandles = driver.getWindowHandles();
        LinkedList<String> lst = new LinkedList<>(windowhandles);
        driver.switchTo().window(lst.get(1));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
        WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(60));
        //WebElement ele = driver.findElement(By.xpath("//*[@id=\"oneC_searchAutoComplete\"]"));
        wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"oneC_searchAutoComplete\"]")));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"oneC_searchAutoComplete\"]"))).sendKeys("trutime");
        driver.findElement(By.xpath("//*[@id=\"newSearchAppsLST\"]/div[1]/div/div[2]")).click();
        driver.switchTo().frame("appFrame");
       List<WebElement> templstofDates= driver.findElements(By.xpath("//div[@class=\"dayHeadr ng-binding ng-scope\"]"));
       List<String> lstOfDate = new LinkedList<>();
       for(WebElement ldt : templstofDates) {
           lstOfDate.add(ldt.getText());
       }
       for(String l : lstOfDate) {
           System.out.println(l);
       }
    }
}
