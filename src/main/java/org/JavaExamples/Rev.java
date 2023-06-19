package org.JavaExamples;

import java.util.Scanner;

public class Rev {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the no");
        int n = sc.nextInt();
        int rev=0,rem=0;
        while (n!=0) {
            rem=n%10;
            rev=(rev*10)+rem;
            n/=10;
        }
        System.out.println(rev);
    }
}
