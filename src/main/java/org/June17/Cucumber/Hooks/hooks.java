package org.June17.Cucumber.Hooks;

import io.cucumber.java.*;

public class hooks {
    @BeforeStep
    public void befor(Scenario scenario) {
        System.out.println(scenario.getName());
    }
    @AfterStep
    public void afer(Scenario scenario) {
        System.out.println(scenario.getStatus());
    }
    @Before
    public  void dis() {
        System.out.println("hi");
    }
    @After
    public void dis1() {
        System.out.println("bye");
    }
}
