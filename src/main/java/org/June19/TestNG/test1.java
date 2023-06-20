package org.June19.TestNG;

import org.testng.annotations.Test;

public class test1 {
    @Test(groups = {"smoke"},invocationCount = 2)
    public  void a() {
        System.out.println("hi");
    }
    @Test(priority = 1,groups = {"smoke"})
    public  void b() {
        System.out.println("hi");
    }
    @Test(priority = 2,groups = {"sanity"})
    public  void c() {
        System.out.println("bye");
    }
    @Test(priority = 3,groups = {"sanity"})
    public  void d() {
        System.out.println("bye");
    }
}
