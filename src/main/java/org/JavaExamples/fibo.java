package org.JavaExamples;

import java.util.Scanner;

public class fibo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the no");
        int n = sc.nextInt();
        int a=-1,b=1,c=0;
        for (int i =0;i<n;i++) {
            c=a+b;
            System.out.println(c);
            a=b;
            b=c;
        }
    }
}
