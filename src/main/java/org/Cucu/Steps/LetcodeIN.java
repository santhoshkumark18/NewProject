package org.Cucu.Steps;

import io.cucumber.java.en.*;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LetcodeIN {
    ChromeDriver driver;

    @Given("User should able click login button")
    public void userShouldAbleClickLoginButton() {
        driver = new ChromeDriver();
        driver.get("https://letcode.in/");
        driver.findElement(By.linkText("Log in")).click();
    }

    @Given("User should able enter as eamil  {string}")
    public void userShouldAbleEnterAsEamil(String string) {
        driver.findElement(By.name("email"))
                .sendKeys(string);
    }

    @Given("User should able enter as passwd {string}")
    public void userShouldAbleEnterAsPasswd(String string) {
        driver.findElement(By.name("password")).sendKeys(string);

    }

    @When("User should able click submit")
    public void userShouldAbleClickSubmit() {
        driver.findElement(By.xpath("//button[.='LOGIN']")).click();
    }

    @Then("Login should be successful")
    public void loginShouldBeSuccessful() {
        String title = driver.getTitle();
        System.out.println("Title is " + title);
        driver.quit();
    }


}