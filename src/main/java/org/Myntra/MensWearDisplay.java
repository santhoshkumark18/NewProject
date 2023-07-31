package org.Myntra;

import com.microsoft.playwright.*;
import org.apache.poi.ss.usermodel.CreationHelper;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class MensWearDisplay {
    public static Row row;

    public static void main(String[] args) throws IOException {
        /*ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.myntra.com");
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        *//*wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//a[@class=\"desktop-categoryLink\"]")));*//*
        WebElement elementShirt = driver.findElement(By.xpath("(//ul[@class=\"desktop-navBlock\"]/li/a)[4]"));
        System.out.println(elementShirt.getText());
        driver.quit();*/
        Playwright playwright = Playwright.create();
        Browser browser = playwright.webkit().launch(new BrowserType.LaunchOptions().setHeadless(false));
        Page page = browser.newPage();
        page.navigate("https://www.myntra.com");
        //Getting Mens collection headings
        Locator listEle = page.locator("//a[@class=\"desktop-categoryLink\"]");
        List<String> allTextContents = listEle.allTextContents();
        System.out.println(allTextContents);
        //Getting Mens collection overallItems
        Locator menswearHeading = page.locator("//a[@class=\"desktop-categoryName\"]");
        List<String> menswearHeadingLst = menswearHeading.allTextContents();
        System.out.println(menswearHeadingLst);
        List<String> newList = new ArrayList<String>();
        for (int i = 0; i < 14; i++) {
            newList.add(menswearHeadingLst.get(i));
        }
        for (int i = 1; i < 54; i++) {
            newList.add(allTextContents.get(i));
        }
        System.out.println("new list");
        System.out.println(newList);
        //Creating a Workbook
        XSSFWorkbook workbook = new XSSFWorkbook();
        /*CreationHelper createHelper = workbook.getCreationHelper();*/
        XSSFSheet sheet = workbook.createSheet("Men");
        row = sheet.createRow(0);
        int r = 0;
        //MensWear
        for (int i = 0; i < 14; i++) {
            row.createCell(r++).setCellValue(menswearHeadingLst.get(i));
        }

        //TopWear row 1 0-9 54 total
       /* int topWear = 1, t = 1, f = 1;
        for (int i = 0; i < 54; i++) {
            row = sheet.createRow(topWear++);
            if (i >= 0 && i <= 8) {
                row= sheet.createRow(sheet.getTopRow()+1);
                System.out.println(row);
                row.createCell(0).setCellValue(page.locator("(//a[@class=\"desktop-categoryLink\"])" + "[" + (i + (1)) + "]").textContent());
            } else if (i >= 9 && i <= 12) {
                row.createCell(1).setCellValue(page.locator("(//a[@class=\"desktop-categoryLink\"])" + "[" + (i + (1)) + "]").textContent());
            } else if (i >= 13 && i <= 18) {
                row= sheet.createRow(sheet.getTopRow()+3);
                row.createCell(2).setCellValue(page.locator("(//a[@class=\"desktop-categoryLink\"])" + "[" + (i + (1)) + "]").textContent());
            }
        }*/
        row = sheet.createRow(1);
        row.createCell(0).setCellValue(page.locator("(//a[@class=\"desktop-categoryLink\"])" + "[" + 1 + "]").textContent());
        row.createCell(1).setCellValue(page.locator("(//a[@class=\"desktop-categoryLink\"])" + "[" + 9 + "]").textContent());
        row.createCell(2).setCellValue(page.locator("(//a[@class=\"desktop-categoryLink\"])" + "[" + 13 + "]").textContent());
        row.createCell(3).setCellValue(page.locator("(//a[@class=\"desktop-categoryLink\"])" + "[" + 18 + "]").textContent());
        row.createCell(4).setCellValue(page.locator("(//a[@class=\"desktop-categoryLink\"])" + "[" + 23 + "]").textContent());
        row.createCell(5).setCellValue(page.locator("(//a[@class=\"desktop-categoryLink\"])" + "[" + 30 + "]").textContent());
        row.createCell(6).setCellValue(page.locator("(//a[@class=\"desktop-categoryLink\"])" + "[" + 38 + "]").textContent());
        row.createCell(7).setCellValue(page.locator("(//a[@class=\"desktop-categoryLink\"])" + "[" + 42 + "]").textContent());



       /* int rowTwo=1;
        for (int j= 10; j <13; j++) {
            row =sheet.createRow(rowTwo++);
            row.createCell(4).setCellValue(page.locator("(//a[@class=\"desktop-categoryLink\"])"+"["+(j+(1))+"]").textContent());
        }*/
        FileOutputStream fileOutputStream = new FileOutputStream("Myntra.xlsx");
        workbook.write(fileOutputStream);
        playwright.close();
    }
}
