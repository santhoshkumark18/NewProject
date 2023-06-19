package org.June17.Java;

public class Arms {
    public static void main(String[] args) {
        int num=371;
        int rem=0,res=0;
        int temp=num;
        while(temp!=0) {
            rem=temp%10;
            res+=rem*rem*rem;
            temp/=10;
        }
         if(res==num) {
             System.out.println(res+"armsno");
        } else {
             System.out.println(res+"not armsno");
         }
    }
}
