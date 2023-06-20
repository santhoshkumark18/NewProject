package org.June20.TestNG;


import org.testng.annotations.Test;

public class Dataprovider {
    @Test(dataProvider = "data",dataProviderClass = Datatutils.class)
    public void getdata(String[] data) {
        System.out.println(data[0]);
    }

}
