package org.JavaExamples;

class one {
    public static  int sum(int a,int b) {
        return a+b;
    }
     public static double sum(double a, double b) {
        return  a+b;
     }
     public  static double sum(int a ,double b) {
        return a+b;
     }
}

public class MethodOverloading {
    public static void main(String[] args) {
        System.out.println();
        one.sum(20,23.3);
        one.sum(20.20,3.33);
    }
}
