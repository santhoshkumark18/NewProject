package org.Cucumber.Hooks;

import io.cucumber.java.*;

public class Hooks {
    @AfterStep
    @Before()
    public void Beforhooks(Scenario scenario) {
        System.out.println(scenario.getName());
    }
    @BeforeStep
    @After
    public void Afterhooks(Scenario scenario) {
        System.out.println(scenario.getName());
    }
}
