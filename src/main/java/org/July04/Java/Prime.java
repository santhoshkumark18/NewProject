package org.July04.Java;

public class Prime {
    public static void main(String[] args) {
        int f=0;
        for(int i=1;i<100;i++){
            for(int j=1;j<100;j++) {
                if(i%j==0) {
                    f++;
                }
            }
            if(f==2) {
                System.out.println(i+"prime no");
            }
            f=0;
        }
    }
}
