package org.June20.TestNG;

import org.testng.annotations.DataProvider;

import java.io.IOException;

public class Datatutils {
    @DataProvider(name = "data",indices = {0})
    public Object[][] data() throws IOException {
        String[][] data=ReadExcel.data();
/*
        String[][] data = {{"santhoshkumar@gmail.com","santhosh@18"},
            {"kumar@gmail.com","kumar@18"}};
*/
        return data;
    }
}
