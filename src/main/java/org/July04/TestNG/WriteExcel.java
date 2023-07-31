package org.July04.TestNG;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileOutputStream;
import java.io.IOException;

public class WriteExcel {
    public static void main(String[] args) throws IOException {
        XSSFWorkbook workbook = new XSSFWorkbook();//
        XSSFSheet sheet = workbook.createSheet("sheet001");
        int i=0,j=0;
        String data[][] = new String[2][2];
        data[0][0] = "santhoshkumar@gmail.com";
        data[0][1] = "ganesh@18";
        data[1][0] = "oviya@gmail.com";
        data[1][1] = "Satnhosh@309423";
        for(String str[]:data) {
            XSSFRow row = sheet.createRow(i++);
            for(String s : str) {
                XSSFCell cell = row.createCell(j++);
                DataFormatter dataFormatter = new DataFormatter();
                dataFormatter.formatCellValue(cell);
                cell.setCellValue(s);
            }
            j=0;
        }
        FileOutputStream fileOutputStream = new FileOutputStream("ExcelSheet.xlsx");
        workbook.write(fileOutputStream);
    }
}
