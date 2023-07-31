package org.August15.DataProvider;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.*;
import org.testng.annotations.DataProvider;

import java.io.IOException;

public class DataUtils {
    @DataProvider(name = "data")
    public Object[][] GetData() throws IOException {
        XSSFWorkbook xssfWorkbook = new XSSFWorkbook("C:\\Projects\\SampleSelenium\\ExcelSheet.xlsx");
        XSSFSheet xssfSheet = xssfWorkbook.getSheetAt(0);
        int rowSize = xssfSheet.getPhysicalNumberOfRows();
        int colSize = xssfSheet.getRow(0).getPhysicalNumberOfCells();
        Object[][] data = new Object[rowSize][colSize];
        System.out.println(rowSize);
        System.out.println(colSize);
        for (int i = 0; i < rowSize; i++) {
            XSSFRow xssfRow = xssfSheet.getRow(i);
            for (int j = 0; j < colSize; j++) {
                XSSFCell xssfCell = xssfRow.getCell(j);
                DataFormatter dataFormatter = new DataFormatter();
                dataFormatter.formatCellValue(xssfCell);
                data[i][j]=xssfCell.getStringCellValue();
            System.out.println(xssfCell.getStringCellValue());
            }
        }
        return data;
    }
}
