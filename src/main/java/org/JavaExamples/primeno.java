package org.JavaExamples;

import java.util.Scanner;

public class primeno {
    public static void main(String[] args) {
        System.out.println("Enter the number");
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
       int f=0;
       for(int i=1;i<=n;i++) {
           if(n%i==0) {
               f++;
           }
       }
       if(f==2) {
           System.out.println("prime no");
       }else {
           System.out.println("not a prime no");
       }
    }
}
