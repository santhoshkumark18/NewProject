package org.June14.JavaPractices;

public class PrimeNO {
    public static void main(String[] args) {
        int f=0;
        for(int n=0;n<=20;n++) {
            for(int i=1;i<10;i++) {
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
