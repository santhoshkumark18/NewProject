package org.June21.Java;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.asserts.Assertion;
import org.testng.asserts.SoftAssert;

import java.util.Date;

public class Assertverify {
    public static void main(String[] args) {
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.google.com");
        String str =driver.getTitle();
        Assertion assertion = new Assertion();
        assertion.assertEquals(str,"google","chrysanthemum");
        Date date = new Date();

        System.out.println(date.toString());
        System.out.println(str);
        driver.quit();
    }
}
