package org.July04.TestNG02;

import org.testng.annotations.DataProvider;

public class DataUtils {
    @DataProvider(name="data")
    public Object[][] data() {
        String[][] str = {{"lakshmi", "laks"},
                {"mithu", "mith"}};
        return str;
    }
}
