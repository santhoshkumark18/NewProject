package org.June14.TestNG;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileOutputStream;
import java.io.IOException;

public class WriteExcel {
    public static void main(String[] args) throws IOException {
        Object[][] data = {
                {"santhoshkumar","Santhosh@18"},
                {"sanjay@gmail.com","Sanjay@19"},
                {"ramesh@gmail.com","ramesh@180"}
        };
        int rowCount=0;
        int colCount=0;
        XSSFWorkbook workbook = new XSSFWorkbook();
        XSSFSheet sheet = workbook.createSheet("GmailDetails");
       for(Object[] d : data) {
           XSSFRow row = sheet.createRow(++rowCount);
           for(Object da : d) {
               XSSFCell cell1 = row.createCell(++colCount);
               cell1.setCellValue((String) da);
           }
       }
        FileOutputStream fileOutputStream = new FileOutputStream("newFile.xlsx");
       workbook.write(fileOutputStream);
    }
}
