package org.June14;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class DragandDrop {
    public static void main(String[] args) {
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://jqueryui.com/droppable/");
        /*driver.switchTo().frame(1);
        WebElement element = driver.findElement(By.xpath("//*[@id=\"draggable\"]"));
        Point point = element.getLocation();
        Actions actions = new Actions(driver);
        actions.dragAndDropBy(element,point.getX()+20, point.getY()+20).build().perform();*/
        driver.switchTo().frame(0);
        WebElement ele1 =driver.findElement(By.id("draggable"));
        WebElement ele2 = driver.findElement(By.id("droppable"));
        Actions actions = new Actions(driver);
        actions.dragAndDrop(ele1,ele2).build().perform();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.switchTo().defaultContent();
        WebElement ele = driver.findElement(By.xpath("//*[@id=\"content\"]/div[3]/a"));
        actions.scrollToElement(ele);
        JavascriptExecutor executor = (JavascriptExecutor)driver;
        //executor.executeScript("arguments[0].scrollIntoView();",ele);
        executor.executeScript("window.scrollBy(0,450);");
    }
}
