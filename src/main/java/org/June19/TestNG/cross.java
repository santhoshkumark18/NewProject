package org.June19.TestNG;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class cross {
    @Parameters({"student","rollno","age"})
    @Test()
    public  void test1(String student,String rollno,int age) {
        System.out.println(student+"+"+rollno+"+"+age);
    }
}
