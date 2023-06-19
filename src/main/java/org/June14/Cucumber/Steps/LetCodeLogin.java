package org.June14.Cucumber.Steps;

import io.cucumber.java.en.*;

public class LetCodeLogin  {

    @When("User should navigate to the application")
    public void userShouldNavigateToTheApplication() {
        System.out.println("navigation");
    }
    @When("User should able click login button")
    public void userShouldAbleClickLoginButton() {
        System.out.println("clickbutton");
    }
    @When("User should able enter as email {string}")
    public void userShouldAbleEnterAsEmail(String string) {
        System.out.println(string);
    }
    @When("User should able enter as pass {string}")
    public void userShouldAbleEnterAsPass(String string) {
        System.out.println(string);
    }
    @Then("login should be successful")
    public void loginShouldBeSuccessful() {
        System.out.println("successful");
    }

}
