package org.June20.Java;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.Arrays;
import java.util.Scanner;

public class Arms {


    public static void main(String[] args) {
        ChromeDriver driver = new ChromeDriver();
        Actions actions = new Actions(driver);
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array size");
        int arm=sc.nextInt();
        int temp=arm,rem=0,rev=0;
        while(temp!=0) {
            rem=temp%10;
            rev+=rem*rem*rem;
            temp/=10;
        }
        if(rem==arm) {
            System.out.println(rem+"is arms");
        }

    }
}
