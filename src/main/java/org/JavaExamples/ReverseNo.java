package org.JavaExamples;

import java.util.Scanner;

public class ReverseNo {
    public static void main(String[] args) {
        System.out.println("Enter the number");
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
        int rev=0,rem;
   while(n!=0) {
       rem=n%10;
       rev=(rev*10)+rem;
       n/=10;
   }
        System.out.println(rev);
    }
}
