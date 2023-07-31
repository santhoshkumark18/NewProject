package org.Myntra;

import com.microsoft.playwright.*;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class MyntraLast {
    public static Row row;

    public static void main(String[] args) throws IOException {
        Playwright playwright = Playwright.create();
        Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
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
        XSSFSheet sheet = workbook.createSheet("Men");
        Set<String> set = new HashSet<>(newList);
        int rownum=0;
        for (int i=0;i<newList.size();i++) {
            Row row = sheet.createRow(rownum++);
            int cellnum = 0;
            Object[] objAr = new String[]{newList.get(i)};
            for (Object obj : objAr) {
                Cell cell = row.createCell(cellnum++);
                    cell.setCellValue(((String) obj));
            }
        }
        FileOutputStream fileOutputStream = new FileOutputStream("TodayTask.xlsx");
        workbook.write(fileOutputStream);
        playwright.close();
    }
}
