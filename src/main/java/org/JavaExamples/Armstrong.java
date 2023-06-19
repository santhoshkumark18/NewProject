package org.JavaExamples;

import java.util.Scanner;

public class Armstrong {

    public static void main(String[] args) {
        System.out.println("Enter the number");
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
        int temp=n,rem,res=0;
        while(temp!=0) {
            rem=temp%10;
            res+=Math.pow(rem,3);
            temp/=10;
        }
        if(res==n) {
            System.out.println("arms");
        } else {
            System.out.println("not arms");
        }
    }
}