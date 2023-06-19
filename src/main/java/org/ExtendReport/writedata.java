package org.ExtendReport;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class writedata {
    public static void main(String[] args) throws IOException {
        Object[][] data = {
                {"santhosh", "santhosh@18"},
                {"gova", "santhosh@18"},
                {"sanjay", "santhosh@18"}
        };
        XSSFWorkbook workbook =  new XSSFWorkbook();
        XSSFSheet sheet = workbook.createSheet("details");
        int rowCount=0;
        int colCount=0;
        for(Object[] ebook: data) {
            Row row = sheet.createRow(++rowCount);
            for (Object d : ebook) {
                Cell cell = row.createCell(++colCount);
                if(d instanceof String) {
                    cell.setCellValue((String) d);
                } else if(d instanceof Integer) {
                    cell.setCellValue((Integer)d);
                }
            }
        }
        FileOutputStream fileOutputStream = new FileOutputStream("output.xlsx");
        workbook.write(fileOutputStream);
    }
}
