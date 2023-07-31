package org.July04.Java;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number");
        int n=sc.nextInt();
        int sum=1;
        for(int i=1;i<=n;i++) {
            sum=sum*i;
        }
        System.out.println(sum);
    }
}
