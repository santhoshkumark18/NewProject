package org.Cucumber.Steps;

import io.cucumber.java.en.*;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Letcode {
    ChromeDriver driver = new ChromeDriver();

    @Given("User should navigate to the application")
    public void userShouldNavigateToTheApplication() {
        driver.get("https://letcode.in/");
    }

    @Given("User should able click login button")
    public void userShouldAbleClickLoginButton() {
        driver.findElement(By.linkText("Log in")).click();
    }

    @Given("User should able enter as eamil {string}")
    public void userShouldAbleEnterAsEamil(String string) {
        driver.findElement(By.name("email")).sendKeys(string);
    }

    @Given("User should able enter as passwd {string}")
    public void userShouldAbleEnterAsPasswd(String string) {
        driver.findElement(By.name("password")).sendKeys(string);
    }

    @When("User click submit")
    public void userClickSubmit() {
        driver.findElement(By.xpath("//button[.='LOGIN']")).click();
    }

    @Then("Login should be successful")
    public void loginShouldBeSuccessful() {
        String title = driver.getTitle();
        System.out.println("Title is " + title);
        driver.quit();
    }

    @Given("User should able enter email as {string}")
    public void userShouldAbleEnterEmailAs(String string) {
        // Write code here that turns the phrase above into concrete actions
        driver.findElement(By.name("email")).sendKeys(string);
    }

    @Given("User should able enter passwd as {string}")
    public void userShouldAbleEnterPasswdAs(String string) {
        // Write code here that turns the phrase above into concrete actions
        driver.findElement(By.name("password")).sendKeys(string);
    }

    @When("Login should be failure")
    public void loginShouldBeFailure() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Login failure");
        driver.quit();
    }


}
