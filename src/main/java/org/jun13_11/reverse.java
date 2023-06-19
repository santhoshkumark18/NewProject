package org.jun13_11;

import java.util.Scanner;

public class reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int num = sc.nextInt();
        int res=0,rem;
        while(num!=0) {
            rem=num%10;
            res=(res*10)+rem;
            num/=10;
        }
    }
}
