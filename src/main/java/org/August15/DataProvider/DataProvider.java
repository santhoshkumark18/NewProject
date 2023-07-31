package org.August15.DataProvider;

import org.testng.annotations.Test;

public class DataProvider {
    @Test(dataProvider = "data",dataProviderClass = DataUtils.class)
    public void Display(String data[]) {
        System.out.println("HI");
        System.out.println(data[0]);
        System.out.println(data[1]);
    }
}
