package org.JavaExamples;

import java.util.Scanner;

public class arms {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the no");
        int n = sc.nextInt();
        int res=0,rem=0,temp;
        temp=n;
        while(temp!=0) {
            rem=temp%10;
            res+=rem*rem*rem;
            temp=temp/10;
        }
        if (res==n) {
            System.out.println("arms");
        } else {
            System.out.println("not arms");
        }
    }
}
