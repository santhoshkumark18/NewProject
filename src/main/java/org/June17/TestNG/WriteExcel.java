package org.June17.TestNG;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class WriteExcel {
    public static void main(String[] args) throws IOException {
        XSSFWorkbook workbook = new XSSFWorkbook();
        XSSFSheet sheet= workbook.createSheet("sheet one");
        Object[][] gmail ={{"santhoshkumar@gmail.com","Santhosh"},
                {"dharanibalan@gmail.com","dharani@19"}};
        int rowCount=0,colCount=0;
        for(Object[] d:gmail) {
            XSSFRow row = sheet.createRow(rowCount++);
            for(Object data :d) {
                XSSFCell cell = row.createCell(colCount++);
                if(data instanceof String) {
                    cell.setCellValue((String)data);
                }else {
                    cell.setCellValue((int)data);
                }
            }
            colCount=0;
        }
        FileOutputStream fileOutputStream = new FileOutputStream("name.xlsx");
        workbook.write(fileOutputStream);

    }
}
