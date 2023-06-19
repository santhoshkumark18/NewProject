package org.Javapgrm;

import java.util.Scanner;

public class reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        int rem,res=0;
        while(n!=0) {
            rem=n%10;
            res=(res*10)+rem;
            n/=10;
        }
        System.out.println(res);
    }
}
