package org.June17.Java;

import java.util.Scanner;

public class reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num= sc.nextInt();
        int res=0,rem=0;
        while (num!=0) {
            rem=num%10;
            res=(res*10)+rem;
            num/=10;
        }
        System.out.println(res);
    }
}
