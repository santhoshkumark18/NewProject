package org.June14.TestNG;

import org.testng.annotations.Test;

public class Test2 {
    @Test(groups = {"smoke"})
    public void groups() {
        System.out.println("hi");
    }
    @Test(groups = {"smoke"})
    public void groups1() {
        System.out.println("hi");
    }
    @Test(groups = {"sanity"})
    public void groups2() {
        System.out.println("bye");
    }
    @Test(groups = {"sanity"})
    public void groups4() {
        System.out.println("Bye");
    }


}
