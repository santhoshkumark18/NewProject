package org.June20.TestNG;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Tables {
    public static void main(String[] args) {
        ChromeDriver driver = new ChromeDriver();
        Wait wait = new FluentWait(driver)
                .withTimeout(Duration.ofSeconds(30))
                .pollingEvery(Duration.ofSeconds(30))
                .ignoring(NoSuchElementException.class);

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int a = sc.nextInt();
        int sum = 0;
        for(int j=1;j<=a;j++) {
            for (int i = 1; i <= 10; i++) {
                sum = j * i;
                System.out.println(j + " * " + i + " = " + sum);
                sum = 0;
            }
            System.out.println("----------------------------------------------------------");
        }
    }
}
