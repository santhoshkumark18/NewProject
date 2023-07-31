package org.July04.TestNG;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameter {
    @Parameters({"name","age"})
    @Test()
    public void params(String name,String rollno) {
        System.out.println(name);
        System.out.println(rollno);
    }
}
