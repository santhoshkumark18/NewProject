package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.List;

public class Table {
    public static void main(String[] args) {
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.letcode.in");
        driver.manage().window().maximize();
        driver.get("https://www.letcode.in/table");
        //Simple
        /*WebElement ele=driver.findElement(By.cssSelector("table#simpletable>tbody"));
        List<WebElement> lstOfElements = ele.findElements(By.tagName("tr"));
        System.out.println(lstOfElements.size());
        for(int i=0;i<lstOfElements.size();i++) {
            List<WebElement> col=lstOfElements.get(i).findElements(By.tagName("td"));
            WebElement data= col.get(1);
            System.out.println(data.getText());
            if(data.getText().equals("Raj")) {
                col.get(3).findElement(By.tagName("input")).click();
            }
        }*/
        WebElement ele=driver.findElement(By.cssSelector("table#simpletable>tbody"));
        List<WebElement> lstofele = ele.findElements(By.tagName("tr"));
       /* System.out.println("lstOfElements "+lstofele.size());
        for(int i=0;i<lstofele.size();i++) {
            List<WebElement> col= lstofele.get(i).findElements(By.tagName("td"));
            WebElement data=col.get(1);
            if(data.getText().equals("Raj")) {
                col.get(3).findElement(By.tagName("input")).click();
            }
        }*/
        for(int i=0;i< lstofele.size();i++) {
            List<WebElement> row = lstofele.get(i).findElements(By.tagName("td"));
            WebElement data= row.get(1);
            if(data.getText().equals("Raj")) {
                row.get(3).findElement(By.tagName("input")).click();
            }
        }


    }
}
