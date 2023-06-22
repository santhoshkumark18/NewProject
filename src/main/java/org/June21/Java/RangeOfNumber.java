package org.June21.Java;

import java.util.Scanner;

public class RangeOfNumber {
    public static int sum(int a) {
        if(a==0){
            return 0;
        } else {
            return a +sum(a-1);
        }
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the number");
        int num= sc.nextInt();
        System.out.println(sum(num));
    }
}
