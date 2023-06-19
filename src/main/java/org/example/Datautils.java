package org.example;

import org.testng.annotations.DataProvider;

import java.io.IOException;

public class Datautils {
    @DataProvider(name = "getData")
    public Object[][] getData() throws IOException {
        String[][] data=ReadExcel.getExcelData();
        return data;
    }
}
