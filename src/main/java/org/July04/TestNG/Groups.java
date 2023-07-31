package org.July04.TestNG;

import org.testng.annotations.Test;

public class Groups {
    @Test(groups = "smoke")
    public void a() {
        System.out.println("smoke");
    }

    @Test(groups = "smoke")
    public void b() {
        System.out.println("smoke");
    }

    @Test(groups = "sanity")
    public void c() {
        System.out.println("sanity");
    }

    @Test(groups = "sanity")
    public void d() {
        System.out.println("sanity");
    }

}
