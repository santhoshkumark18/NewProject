package org.Javapgrm;

import java.awt.image.ImageProducer;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class fiboncaii {
    public static void main(String[] args) {
       /* Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();*/
        HashMap<String,Integer> map = new HashMap<>();
        map.put("akshya",98);
        map.put("sandhiya",77);
        map.put("sanjay",78);
        map.put("swroop",78);
        map.put("sanjay",99);
        for(Map.Entry m :map.entrySet() ) {
            System.out.println(m.getValue() +"+"+m.getKey());
        }


    }
}
