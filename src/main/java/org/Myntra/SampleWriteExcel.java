package org.Myntra;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class SampleWriteExcel {
    public static Row row;

    public static void main(String[] args) throws IOException {
        XSSFWorkbook workbook = new XSSFWorkbook();
        XSSFSheet sheet = workbook.createSheet("excel");
        row = sheet.createRow(0);
        String str[] = {"santhosh", "kumar", "gita", "lakshmi"};
        int r = 0, c = 0;
        for (int i = 0; i < str.length; i++) {
            row.createCell(r++).setCellValue(str[i]);
        }
        FileOutputStream fileOutputStream = new FileOutputStream("Men.xlsx");
        workbook.write(fileOutputStream);
    }
}
