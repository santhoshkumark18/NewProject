package org.July04.TestNG.POI;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class WriteExcel {
    public static void main(String[] args) throws IOException {
        XSSFWorkbook workbook = new XSSFWorkbook();
        XSSFSheet sheet = workbook.createSheet("userDetails");
        int rowCount = 0;
        int colCount = 0;
        String str[][] = new String[2][2];
        str[0][0] = "santhoshkumar@gmail.com";
        str[0][1] = "santhosh@18";
        str[1][0] = "govarathanan@gmail.com";
        str[1][1] = "gova@18";
        for (String st[] : str) {
            XSSFRow row = sheet.createRow(rowCount++);
            for (String s : st) {
                XSSFCell cell = row.createCell(colCount++);
                DataFormatter dataFormatter = new DataFormatter();
                dataFormatter.formatCellValue(cell);
                cell.setCellValue(s);
            }
            colCount=0;
        }
        FileOutputStream fileOutputStream = new FileOutputStream("C:\\Projects\\SampleSelenium\\src\\main\\java\\org\\July04\\TestNG\\POI\\test.xlsx");
        workbook.write(fileOutputStream);
    }
}
