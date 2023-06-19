package org.JavaExamples;

import java.util.Scanner;

public class ArrayI {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the numb");
        int n=sc.nextInt();
        int[] ar=new int[n];
        for(int i=0;i<n;i++) {
            System.out.println("enter the value of"+i);
            ar[i]=sc.nextInt();
        }
        for(int i :ar) {
            System.out.println(i);
        }
    }
}
