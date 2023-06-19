package org.POI;

import org.testng.annotations.DataProvider;

import java.io.IOException;

public class DataUtils {
    @DataProvider(name = "getData",parallel = true)
    public Object[][] getData() throws IOException {
/*        String[][] exceldata=ReadExcel.getExcelData();*/
       /* String[][] data= new String[2][2];
        data[0][0]="santhoshinreallife@gmail.com";
        data[0][1]="Santhosh@18";
        data[1][0]="santhosh@gmail.com";
        data[1][1]="Santhosh@18";*/
        /*return exceldata;*/
        return null;
    }
}
