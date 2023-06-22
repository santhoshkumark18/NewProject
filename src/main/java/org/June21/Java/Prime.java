package org.June21.Java;

public class Prime {
    public static void main(String[] args) {
        int f=0;
        for(int n=1;n<20;n++) {
            for(int i=1;i<20;i++) {
                if(n%i==0) {
                    f++;
                }
            }
            if(f==2) {
                System.out.println(n+" prime no");
            }
            f=0;
        }
    }
}
