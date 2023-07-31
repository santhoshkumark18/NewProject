package org.Amazon;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.FileOutputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class Amazon {


    public static void main(String[] args) throws IOException, IOException {


        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.amazon.in/");

        driver.manage().window().maximize();

        driver.findElement(By.xpath("//a[@id=\"nav-hamburger-menu\"]")).click();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//div[@class=\"hmenu-item hmenu-title \"]")));

        List<WebElement> lstOfHeading = driver.findElements(By.xpath("//div[@class=\"hmenu-item hmenu-title \"]"));
        for(WebElement e : lstOfHeading) {
            System.out.println(e.getAttribute("innerText"));
        }

        List<WebElement> lsfOfSubTitles = driver.findElements(By.xpath("//a[@class=\"hmenu-item\"]"));
        for(WebElement lst : lsfOfSubTitles) {
            System.out.println(lst.getAttribute("innerText"));
        }

            XSSFWorkbook workbook = new XSSFWorkbook();

            XSSFSheet sheet = workbook.createSheet("amazon");

            int rowNO = 0;



            for (int i = 1; i <=5; i++) {
                Row row = sheet.createRow(rowNO++);

                row.createCell(0).setCellValue(lstOfHeading.get(i).getAttribute("innerText"));


            }

            /*XSSFRow rnow = sheet.createRow(1);*/
            int col=0;

            for (int i = 1; i <10; i++) {
                XSSFRow rnow = sheet.createRow(col++);

                /*row = sheet.createRow(rnow++);*/

                rnow.createCell(1).setCellValue(lsfOfSubTitles.get(i).getAttribute("innerText"));

            }
/*        int now = 1;

        for (int i = 1; i < 3; i++) {

            row = sheet.createRow(now++);

            row.createCell(1).setCellValue(lsfOfSubTitles.get(i).getAttribute("innerText"));

        }*/

            FileOutputStream fileOutputStream = new FileOutputStream("amazon.xlsx");
            workbook.write(fileOutputStream);
            driver.quit();
        }

    }
