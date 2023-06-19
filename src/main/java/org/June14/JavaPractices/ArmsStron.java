package org.June14.JavaPractices;

public class ArmsStron {
    public static void main(String[] args) {
        int num = 153;
        int rem = 0, res = 0;
        int temp = num;
        while (temp != 0) {
            rem = temp % 10;
            res += rem * rem * rem;
            temp /= 10;
        }
        if (num == res) {
            System.out.println(num + "is palindrome");
        }
        else {
            System.out.println(num+"is not palindrom");
        }
    }
}
