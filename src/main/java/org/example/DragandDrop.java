package org.example;

import org.openqa.selenium.chrome.ChromeDriver;

public class DragandDrop {
    public static void main(String[] args) {
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.jqueryui.com");
        driver.manage().window().maximize();
        driver.get("https://www.jqueryui.com/draggable");

    }
}
