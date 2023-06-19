package org.Dataprovider;

import org.testng.annotations.DataProvider;

import java.io.IOException;

public class DataUtils {
    @DataProvider(name="data")
    public Object[][] data() throws IOException {
        String[][] str = ReadExcel.main();
/*        str[0][0] = "santhoshinreallife@gmail.com";
        str[0][1] = "Santhosh@18";
        str[1][0] = "santhosh@gmail.com";
        str[1][1] = "Santhosh@18";*/

        return str;
    }
}
