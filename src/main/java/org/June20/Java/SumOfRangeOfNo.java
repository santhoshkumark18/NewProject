package org.June20.Java;

import java.util.Scanner;

public class SumOfRangeOfNo {
    static  int sumOfNo(int n) {
        if(n>0)
            return n+sumOfNo(n-1);
        return 0;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n= sc.nextInt();
        System.out.println(sumOfNo(n));
    }
}
