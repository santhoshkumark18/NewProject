package org.June14.TestNG;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.IOException;

public class ReadExcel {
    public static String [][] getData() throws IOException {
        XSSFWorkbook workbook = new XSSFWorkbook("C:\\Projects\\SampleSelenium\\output.xlsx");
        XSSFSheet sheet = workbook.getSheetAt(0);
        int rowSize =sheet.getPhysicalNumberOfRows();
        int colSize = sheet.getRow(0).getPhysicalNumberOfCells();
        String[][] data = new String[rowSize][colSize];
        for(int i=0;i<rowSize;i++){
            XSSFRow row = sheet.getRow(i);
            for(int j=0;j<colSize;j++) {
                XSSFCell cell = row.getCell(i);
                DataFormatter dataFormatter = new DataFormatter();
                dataFormatter.formatCellValue(cell);
                System.out.println(cell.getStringCellValue());
                data[i][j]= cell.getStringCellValue();
            }
        }
        return  data;
    }
}
