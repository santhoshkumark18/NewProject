package org.jun13_11;

public class fibonacii {
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
