package org.June14.Cucumber.Hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hooks {
@After
    public void before(Scenario scenario ) {
        System.out.println(scenario.getName());
    }
    @Before
    public void after(Scenario scenario) {
        System.out.println(scenario.getName());
    }
    public void beforescenario(Scenario scenario) {
        System.out.println(scenario.getName());
    }
    public void afterScenario(Scenario scenario) {
        System.out.println(scenario.getName());
    }
}
