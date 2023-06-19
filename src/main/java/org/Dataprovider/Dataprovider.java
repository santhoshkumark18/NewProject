package org.Dataprovider;

import org.testng.annotations.Test;

public class Dataprovider {
    @Test(dataProvider ="data",dataProviderClass = DataUtils.class)
    public void getdata(String[] data) {
        System.out.println(data[0]);
        System.out.println(data[1]);
    }

}
