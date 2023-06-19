package org.June14.TestNG;

import org.testng.annotations.DataProvider;

import java.io.IOException;

public class DataUtils {
    @DataProvider(name="data"/*indices = {0,1,2,3,4}*/,parallel = true)
    public static Object[] getData() throws IOException {
        /*String[] data = {"ind vs aus","dhoni","virat","rohit","mohit sharma"};*/
        String data[][]=ReadExcel.getData();
        return data;
    }
}
