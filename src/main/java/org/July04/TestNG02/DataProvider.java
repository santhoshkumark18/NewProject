package org.July04.TestNG02;

import org.testng.annotations.Test;

public class DataProvider {
    @Test(dataProvider = "data",dataProviderClass = DataUtils.class)
    public void gd(String data[]){
        System.out.println(data[0]);
        System.out.println(data[1]);
    }
}
