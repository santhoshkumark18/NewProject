package org.jun13_11;

import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int num = sc.nextInt();
        int sum=1;
        for(int i=1;i<=num;i++) {
            sum=sum*i;
        }
        System.out.println(sum);
    }
}
