package org.JavaExamples;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        System.out.println("Enter the number");
        Scanner sc =new Scanner(System.in);
        int f = sc.nextInt();
        int sum = 0,a=0,b=1;
        for(int i=0;i<=f;i++) {
            sum=a+b;
            a=b;
            b=sum;
            System.out.println(sum);
        }
    }
}
