package org.July04.Java;

public class Arms {
    public static void main(String[] args) {
        int n = 153, temp = n, rem = 0, sum = 0;
        while (temp != 0) {
            rem = temp % 10;
            sum += rem * rem * rem;
            temp /= 10;
        }
        if (sum == n) {
            System.out.println(sum + " is arms");
        } else {
            System.out.println(sum + " is not arms");
        }
    }
}
