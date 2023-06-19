package org.June17.TestNG;

import org.testng.annotations.Test;

public class DataProvider {
    @Test(dataProviderClass = Datautils.class,dataProvider = "data")
    public void display(String data[]) {
        System.out.println(data[0]);
    }
}
