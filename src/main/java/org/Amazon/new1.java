package org.Amazon;


import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import io.github.bonigarcia.wdm.WebDriverManager;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;




public class new1 {



    public static void main(String[] args) throws IOException, IOException {





        WebDriverManager.chromedriver().setup();



        WebDriver driver = new ChromeDriver();



        driver.get("https://www.amazon.in/");



        driver.manage().window().maximize();



        driver.findElement(By.xpath("//a[@id=\"nav-hamburger-menu\"]")).click();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));



        wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//div[@class=\"hmenu-item hmenu-title \"]")));



        List<WebElement> lstOfHeading = driver.findElements(By.xpath("//div[@class='hmenu-item hmenu-title ']"));
        for(WebElement e : lstOfHeading) {



            System.out.println(e.getAttribute("innerText"));



        }
        List<WebElement> lsfOfSubTitles = driver.findElements(By.xpath("//a[@class='hmenu-item']"));



        for(WebElement lst : lsfOfSubTitles) {



            System.out.println(lst.getAttribute("innerText"));



        }
        XSSFWorkbook workbook = new XSSFWorkbook();
        XSSFSheet sheet = workbook.createSheet("amazon");
        int size = lstOfHeading.size();
        for (int i = 0; i <size; i++) {
            XSSFRow row = sheet.createRow(i);
            XSSFCell cell = row.createCell(0);
            cell.setCellValue(lstOfHeading.get(i).getText());
            XSSFCell cell1=row.createCell(1);
            cell1.setCellValue(lsfOfSubTitles.get(i).getText());

        }
        FileOutputStream fileOutputStream = new FileOutputStream("amazon2.xlsx");
        workbook.write(fileOutputStream);
        workbook.close();
        driver.quit();
    }



}
