package org.example;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.IOException;

public class ReadExcel {
    public static String[][] getExcelData() throws IOException {
        String loc = "C:\\Projects\\SampleSelenium\\src\\main\\java\\org\\POI\\Login.xlsx";
        XSSFWorkbook workbook = new XSSFWorkbook(loc);
        XSSFSheet sheet = workbook.getSheetAt(0);

        int rowSize = sheet.getLastRowNum();
        int colSize = sheet.getRow(1).getPhysicalNumberOfCells();
        System.out.println("rowSize " + rowSize + " colSize " + colSize);
        String[][] data= new String[rowSize][colSize];
        for (int i = 1; i < rowSize; i++) {
            XSSFRow row = sheet.getRow(i);
            for (int j = 0; j < colSize; j++) {
                XSSFCell cell = row.getCell(j);
                DataFormatter dft = new DataFormatter();
                String val = dft.formatCellValue(cell);
                data[i-1][j]=val;
            }

        }
        return data;
    }
}
