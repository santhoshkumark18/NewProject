package org.June17.TestNG;

import org.testng.SkipException;
import org.testng.annotations.Test;

public class Test1 {
    @Test(priority = 1,expectedExceptions = RuntimeException.class)
    public void login() {
        throw  new RuntimeException("error in login button");
    }
    @Test(priority =2,dependsOnMethods = {"login"},alwaysRun = true)
    public void emailId() {
        System.out.println("emailId");
    }
    @Test(priority = 3,invocationCount = 3,invocationTimeOut = 300)
    public void pass() {
        System.out.println("pass");
    }
    @Test(priority = 4)
    public void submit() {
        System.out.println("submit");
    }

}
