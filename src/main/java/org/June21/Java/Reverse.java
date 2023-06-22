package org.June21.Java;

import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num=sc.nextInt();
        int rem=0,res=0;
        while(num!=0) {
            rem=num%10;
            res=(res*10)+rem;
            num/=10;
        }
        System.out.println(res+" reverse is");

    }
}
