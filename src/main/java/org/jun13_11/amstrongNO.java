package org.jun13_11;

import java.util.Scanner;

public class amstrongNO {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int num = sc.nextInt();
        int temp=num,rem,res=0;
        while(temp!=0) {
            rem=temp%10;
            res+=rem* rem* rem;
            temp/=10;
        }
        if(res==num) {
            System.out.println("arms no");
        }
        System.out.println("not arms no");
    }
}
