package org.June20.Cucumber.Hooks;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.testng.annotations.BeforeSuite;

public class hooks {
    @Before
    public void one(Scenario scenario) {
        System.out.println(scenario.getName());
    }
    @After
    public void two(Scenario scenario) {
        System.out.println(scenario.getName());
    }
    @AfterStep
    public  void three(Scenario scenario) {
        System.out.println("stepshooks");
    }
}
