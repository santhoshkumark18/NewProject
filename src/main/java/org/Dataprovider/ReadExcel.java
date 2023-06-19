package org.Dataprovider;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.IOException;

public class ReadExcel {
    public static String[][] main() throws IOException {

        XSSFWorkbook workbook = new XSSFWorkbook("C:\\Projects\\SampleSelenium\\output.xlsx");
        XSSFSheet sheet = workbook.getSheetAt(0);
        int rowSize = sheet.getPhysicalNumberOfRows();
        int colSize = sheet.getRow(1).getPhysicalNumberOfCells();
        String[][] str= new String[rowSize][colSize];
        for (int i = 0; i < rowSize; i++) {
            XSSFRow row = sheet.getRow(i);
            for (int j = 0; j < colSize; j++) {
                XSSFCell cell = row.getCell(j);
                DataFormatter dft = new DataFormatter();
                dft.formatCellValue(cell);
                str[i][j]=cell.getStringCellValue();
            }


        }
        return str;
    }
}
