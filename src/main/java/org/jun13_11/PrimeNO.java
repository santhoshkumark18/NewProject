package org.jun13_11;

import java.util.Scanner;

public class PrimeNO {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int f=0;
        for(int n=0;n<20;n++) {
            for(int i=1;i<10;i++) {
                if(n%i==0) {
                    f++;
                }
            }
            if(f==2) {
                System.out.println(n+"prime no");
            }/*11.775
                    9.75
                            24.115
                                    22.995*/
            f=0;
        }

    }
}
