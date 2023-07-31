package org.July03;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.IOException;

public class ReadExcel {
    public static void main(String[] args) throws IOException {
        XSSFWorkbook workbook = new XSSFWorkbook("C:\\Projects\\SampleSelenium\\name.xlsx");
        XSSFSheet sheet = workbook.getSheetAt(0);
        int rowCount = sheet.getPhysicalNumberOfRows();
        int colCount = sheet.getRow(0).getPhysicalNumberOfCells();
        for(int i=0;i<rowCount;i++) {
            XSSFRow row = sheet.getRow(i);
            for(int j=0;j<colCount;j++) {
                XSSFCell cell = row.getCell(j);
                DataFormatter dataFormatter = new DataFormatter();
                dataFormatter.formatCellValue(cell);
                System.out.println(cell.getStringCellValue());
            }
        }
    }
}
