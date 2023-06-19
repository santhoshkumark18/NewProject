package org.CucumberPractices.Steps;

import io.cucumber.java.en.*;

public class Steps {

    @When("should be login successfull")
    public void should_be_login_successfull() {
        System.out.println("hi");
    }
    @When("user should enter the user as {string}")
    public void userShouldEnterTheUserAs(String string) {
        System.out.println("hi");
    }
    @When("user should enter the pass as {string}")
    public void userShouldEnterThePassAs(String string) {
        System.out.println("hi");
    }
    @When("user should click login button")
    public void user_should_click_login_button() {
        System.out.println("hi");
    }
    @Then("login should be successfull")
    public void login_should_be_successfull() {
        System.out.println("hi");
    }


}
