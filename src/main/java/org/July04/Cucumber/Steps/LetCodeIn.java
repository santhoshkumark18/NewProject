package org.July04.Cucumber.Steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LetCodeIn {
    @When("User should navigate to the application")
    public void userShouldNavigateToTheApplication() {
    System.out.println("hello");
    }
    @When("User should able click login button")
    public void userShouldAbleClickLoginButton() {
        System.out.println("hello");
    }
    @When("User should able enter as email {string}")
    public void userShouldAbleEnterAsEmail(String string) {
        System.out.println(string);
    }
    @When("User should able enter as passwd {string}")
    public void userShouldAbleEnterAsPasswd(String string) {
        System.out.println(string);
    }
    @Then("Login should be successful")
    public void loginShouldBeSuccessful() {
        System.out.println("hello");
    }


}
