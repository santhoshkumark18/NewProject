package org.JavaExamples;

import java.util.Scanner;

public class prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the no");
        int num = sc.nextInt();
        int f=0;
        for(int n=1;n<=20;n++) {
            for(int i=1;i<num;i++) {
                if(n%i==0) {
                    f++;
                }
            }
            if(f==2) {
                System.out.println(n+"primeno");
            }
            f=0;
        }
    }
}
