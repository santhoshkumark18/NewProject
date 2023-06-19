package org.June17.TestNG;

import org.testng.annotations.Test;

public class Groups {
    @Test(groups = {"smoke"},enabled = false)
    public void login() {
        System.out.println("hi");
    }
    @Test(groups = {"smoke"})
    public void lastname() {
        System.out.println("hi");
    }
    @Test(groups = {"sanity"})
    public void  firstname() {
        System.out.println("bye");
    }
    @Test(groups = {"sanity"})
    public void sumbit() {
        System.out.println("bye");
    }
}
