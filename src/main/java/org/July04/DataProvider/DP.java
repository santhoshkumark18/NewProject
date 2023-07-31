package org.July04.DataProvider;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DP {
    @Test(dataProvider = "data",dataProviderClass = DataUtils.class)
    public void getData(String data[]) {
        System.out.println(data[0]);
        System.out.println(data[1]);
    }
}
