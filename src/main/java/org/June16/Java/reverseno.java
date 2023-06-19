package org.June16.Java;

public class reverseno {
    public static void main(String[] args) {
        int num=12345;
        int rem=0,res=0;
        while(num!=0) {
            rem=num%10;
            res=(res*10)+rem;
            num/=10;
        }
        System.out.println(res);
    }
}
