package org.July04.Java;

public class Fibonacci {
    public static void main(String[] args) {
        int a=-1,b=1,c;
        for(int i=0;i<10;i++) {
            c=a+b;
            System.out.println(c);
            a=b;
            b=c;
        }
    }
}
