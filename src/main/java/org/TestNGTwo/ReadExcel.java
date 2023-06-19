package org.TestNGTwo;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.IOException;

public class ReadExcel {
    public static String[][] excelData() throws IOException {
        XSSFWorkbook workbook = new XSSFWorkbook("C:\\Projects\\SampleSelenium\\src\\main\\java\\org\\TestNGTwo\\Book1.xlsx");
        XSSFSheet sheet = workbook.getSheetAt(0);
        int rowNum=sheet.getLastRowNum();
        int colSize=sheet.getRow(0).getPhysicalNumberOfCells();
        String[][] str= new String[rowNum][colSize];
        for(int i=1;i<rowNum;i++) {
            XSSFRow row=sheet.getRow(i);
            for(int j=0;j<colSize;j++) {
                XSSFCell cell= row.getCell(j);
                DataFormatter dataFormatter = new DataFormatter();
                dataFormatter.formatCellValue(cell);
                str[i-1][j]= cell.getStringCellValue();
            }
        }
        return str;
    }

}
