package org.June17.Java;

public class primenon {
    public static void main(String[] args) {
        int f=0;
        for(int n=1;n<20;n++) {
            for(int i=1;i<10;i++) {
                if(n%i==0) {
                    f++;
                }
            }
            if(f==2) {
                System.out.println(n+" primeno");
            }
            f=0;
        }
    }
}
