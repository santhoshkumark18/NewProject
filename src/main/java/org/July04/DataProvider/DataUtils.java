package org.July04.DataProvider;

import org.apache.poi.xwpf.usermodel.BreakType;
import org.testng.annotations.DataProvider;

public class DataUtils {
    @DataProvider(name="data")
    public Object[][] data(){
        String[][] str = {{"lakshmi","mithu"},
                {"nandhini","nandhu"}};
        return str;
    }
}
