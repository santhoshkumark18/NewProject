package org.Collecctions;

import java.util.*;

public class AllLists {
    public static void main(String[] args) {
        ArrayList<Integer> list= new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(4);
        list.add(3);
        System.out.println(list);
        Iterator itr = list.iterator();
        while(itr.hasNext()) {
            System.out.println(itr.next());
        }

        HashSet<String> set = new HashSet<>();
        set.add("santhosh");
        set.add("kumar");
        set.add("prasana");
        set.add("sanjay");
        Iterator it = set.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

    }
}
