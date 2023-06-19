package org.June17.Cucumber.Steps;

import io.cucumber.java.en.*;

public class LetCodeIn {
    @When("User should able click login button")
    public void userShouldAbleClickLoginButton() {
        
    }
    @When("User should able enter as email {string}")
    public void userShouldAbleEnterAsEmail(String string) {
        System.out.println("santhosh");
    }
    @When("User should able enter as passwd {string}")
    public void userShouldAbleEnterAsPasswd(String string) {
     System.out.println("santhosh");
    }
    @Then("Login should be successful")
    public void loginShouldBeSuccessful() {
     System.out.println("santhosh");
    }
    @When("Login should be failed")
    public void loginShouldBeFailed() {
        System.out.println("santhosh");
    }

}
