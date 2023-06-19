package org.June14.TestNG;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Test1 {

    WebDriver driver;
    @Parameters("browser")
    @Test(priority = 0)
    public void sign(String webbrowser) {
        switch (webbrowser) {
            case "chrome":
                driver = new ChromeDriver();
                break;
            case "edge":
                driver = new FirefoxDriver();
                break;
            default:
                System.out.println("chose correct browser");
        }
        driver.get("https://www.letcode.in");
        driver.findElement(By.xpath("//*[@id=\"navbar-menu\"]/div[2]/div/div/a[2]")).click();
    }
    @Parameters("email")
    @Test(priority = 1)
    public void firstname(String email) {
        driver.findElement(By.name("email")).sendKeys(email);
    }
    @Parameters("password")
    @Test(priority = 2,dependsOnMethods = {"firstname"},alwaysRun = true)
    public void pass(String pass) {
        driver.findElement(By.name("password")).sendKeys(pass);
    }

    @Test(priority = 3)
    public void clickLogin() {
        driver.findElement(By.xpath("/html/body/app-root/app-signin/div/div/div/div/form/div[3]/p/button")).click();
    }

    @Test(priority = 3)
    public void getTitle() {
        System.out.println(driver.getTitle());
        driver.quit();
    }


}
