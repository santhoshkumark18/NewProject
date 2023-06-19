package org.jun13_11;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class palindrom {
    public static void main(String[] args) {
        int num = 121;
        int rem = 0, res = 0;
        int temp = num;
        while (temp != 0) {
            rem = temp % 10;
            res = (res * 10) + rem;
            temp /= 10;
        }
        if (res == num) {
            System.out.println(num + " is plaindorome no");

        } else {
            System.out.println(num + " is not palindrome no");
        }
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(10);
        arrayList.add(50);
        arrayList.add(20);
        arrayList.add(40);
        Iterator itr = arrayList.iterator();
        while(itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}
