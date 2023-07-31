package org.POI;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class WriteExcel {
    public static void main(String[] args) throws IOException {
        XSSFWorkbook workbook = new XSSFWorkbook();
        XSSFSheet sheet = workbook.createSheet("userdetails");
        String[][] data= new String[2][2];
        data[0][0]="santhoshinreallife@gmail.com";
        data[0][1]="Santhosh@18";
        data[1][0]="santhosh@gmail.com";
        data[1][1]="Santhosh@18";
        int rowCount=0;
        int columnCount=0;
        for(String[] str :data) {
            Row row = sheet.createRow(++rowCount);
            for(String col :str) {
                Cell cell= row.createCell(++columnCount);
                    cell.setCellValue(col);
                }
        }
        FileOutputStream fileOutputStream = new FileOutputStream("C:\\Projects\\SampleSelenium\\src\\main\\java\\org\\POI\\data.xlsx");
        workbook.write(fileOutputStream);
    }
}
