package org.June20.Cucumber.Steps;

import io.cucumber.java.en.*;

public class Letcodein {

    @When("User should navigate to the application")
    public void userShouldNavigateToTheApplication() {
      System.out.println("hi");
    }
    @When("User should able enter as email {string}")
    public void userShouldAbleEnterAsEmail(String string) {
        System.out.println(string);
    }
    @When("User should able enter as pass {string}")
    public void userShouldAbleEnterAsPass(String string) {
        System.out.println(string);
    }
    @When("User should able click login button")
    public void userShouldAbleClickLoginButton() {
        System.out.println("hi");
    }
    @Then("login should be successful")
    public void loginShouldBeSuccessful() {
        System.out.println("hi");
    }

}
