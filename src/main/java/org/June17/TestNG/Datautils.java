package org.June17.TestNG;

import org.testng.annotations.DataProvider;

public class Datautils {
    @DataProvider(name="data",indices = {0})
    public Object[] data() {
String[] data ={"santhosh","sanjay","rohit","virat"};
        return data;
    }
}