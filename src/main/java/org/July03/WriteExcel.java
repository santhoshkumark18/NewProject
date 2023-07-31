package org.July03;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteExcel {
    public static void main(String[] args) {
        XSSFWorkbook workbook = new XSSFWorkbook();
        workbook.createSheet("sheet1.xlsx");
        XSSFSheet sheet = workbook.createSheet("sheetone");
        Object data[][] = {
                {"santhosh", "Santhosh@18"},
                {"dharani", "dharaniBalan@26"}
        };
        int i=0;
        int j=0;
        for(Object da[] : data) {
            XSSFRow row = sheet.createRow(i++);
            for(Object d : da) {
                XSSFCell cell = row.createCell(j++);
                cell.setCellValue((String) d);
            }
        }
    }
}
