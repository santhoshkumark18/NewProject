package org.TestNGTwo;

import lombok.ToString;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.IOException;

public class DataUtils {
    @DataProvider(name="getData")
    @Test
    public Object[][] getData() throws IOException {
        String[][] str = new String[2][2];
        str=ReadExcel.excelData();
 /*       str[0][0] = "santhoshinreallife@gmail.com";
        str[0][1] = "Santhosh@18";
        str[1][0] = "santhoshkumar@gmail.com";
        str[1][1] = "Santhosh@19";*/

        return str;
    }
}
