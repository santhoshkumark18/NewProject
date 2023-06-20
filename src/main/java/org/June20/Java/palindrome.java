package org.June20.Java;

import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int a = sc.nextInt();
        int temp=a,rev=0,rem=0;
        while (temp!=0) {
            rem=temp%10;
            rev=(rev*10)+rem;
            temp/=10;
        }
        if(rev==a) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
    }
}
