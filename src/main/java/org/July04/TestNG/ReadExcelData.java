package org.July04.TestNG;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

import java.io.IOException;

public class ReadExcelData {
    @DataProvider
    public Object[][] data() throws IOException {
        XSSFWorkbook workbook = new XSSFWorkbook("C:\\Projects\\SampleSelenium\\name.xlsx");
        XSSFSheet sheet = workbook.getSheetAt(0);
        int rowCount = sheet.getPhysicalNumberOfRows();
        int colCount = sheet.getRow(0).getPhysicalNumberOfCells();
        String[][] data = new String[rowCount][colCount];
        for (int i = 0; i < rowCount; i++) {
            XSSFRow row = sheet.getRow(i);
            for (int j = 0; j < colCount; j++) {
                XSSFCell cell = row.getCell(j);
                DataFormatter dataFormatter = new DataFormatter();
                dataFormatter.formatCellValue(cell);
                data[i][j] = cell.getStringCellValue();
                System.out.println(cell.getStringCellValue());
            }
        }
        return data;
    }
}
