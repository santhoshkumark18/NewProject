package org.June18.Java;

public class primeno {
    public static void main(String[] args) {
        int f=0;
        for(int n=1;n<20;n++) {
            for(int i=1;i<20;i++){
                if(n%i==0) {
                    f++;
                }
            }
            if(f==2) {
                System.out.println(n+"is prime no");
            }
            f=0;
        }
    }
}
