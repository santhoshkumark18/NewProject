package org.Before;

public class prime {
    public static void main(String[] args) {
        int f=0;
        for(int i=0;i<10;i++) {
            for(int j=1;j<10;j++) {
                if(i%j==0) {
                    f++;
                }
            }
            if(f==2)
                System.out.println(i+"primeno");
            f=0;
        }
    }
}
