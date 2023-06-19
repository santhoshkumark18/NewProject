package org.June16.Java;

public class arms {
    public static void main(String[] args) {
        int num=153;
        int rem=0,res=0,temp=num;
        while(temp!=0) {
            rem=temp%10;
            res+=rem*rem*rem;
            temp/=10;
        }
        if(res==num) {
            System.out.println("armsno");
        } else {
            System.out.println("not arms no");
        }
    }
}
