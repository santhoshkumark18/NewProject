package org.Javapgrm;

import java.util.Scanner;

public class Arms {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        int rem,res=0,temp;
        temp=n;
        while(temp!=0) {
            rem=temp%10;
            res+=rem*rem*rem;
            temp/=10;
        }
        if(res==n) {
            System.out.println("arms no");
        } else {
            System.out.println("not arms no");
        }
    }
}
