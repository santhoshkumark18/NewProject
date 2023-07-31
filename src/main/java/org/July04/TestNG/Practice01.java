package org.July04.TestNG;

import org.openqa.selenium.NoSuchElementException;
import org.testng.annotations.Test;

public class Practice01 {
    @Test(priority =0)
    public void a() {
        System.out.println("a");
    }
    @Test(priority =1,dependsOnMethods = "a")
    public void b() {
        System.out.println("b");
    }
    @Test(priority = 2)
    public void c() {
        System.out.println("c");
    }
    @Test(priority = 3)
    public void d() {
        System.out.println("d");
    }
}
