package org.June19.Java;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.asserts.Assertion;
import org.testng.asserts.SoftAssert;

public class AssertProgram {
    public static void main(String[] args) {
        ChromeDriver driver =new ChromeDriver();
        driver.get("https://www.google.com");
        System.out.println(driver.getTitle());
        Assertion assertion = new SoftAssert();
        assertion.assertEquals("Google","Edge");
        System.out.println("End");
    }
}
