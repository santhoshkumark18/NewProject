package org.June21.Java;

import java.util.Scanner;

public class Recursion {
    public static  int fact(int n) {
        if(n==0)
            return 1;
        return n*fact(n-1);
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the number");
        int num= sc.nextInt();
        System.out.println(fact(num));
    }
}
