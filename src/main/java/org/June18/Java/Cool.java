package org.June18.Java;

import java.util.Scanner;

public class Cool {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int num = sc.nextInt();
        int temp=num,res=0,rem=0;
        while(temp!=0) {
            rem=temp%10;
            res+=rem*rem*rem;
            temp/=10;
        }
        if(res==num) {
            System.out.println(res+" armsno");
        } else {
            System.out.println(res+" not arms");
        }
    }
}
