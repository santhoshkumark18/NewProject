package org.July04.TestNG;

import org.testng.annotations.Test;

public class DataProvider {
    @Test(dataProvider ="data",dataProviderClass = ReadExcelData.class)
    public void getData(String data[]) {
        System.out.println(data[0]);
        System.out.println(data[1]);
    }
}
