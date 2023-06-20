package org.June20.Java;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.util.Iterator;
import java.util.Stack;
import java.util.Vector;

public class Collections {
    public static void main(String[] args) {
        RemoteWebDriver driver = new ChromeDriver();
        Vector<Integer> s = new Vector<>();
        s.add(1);
        s.add(2);
        s.add(3);
        Iterator iterator = s.iterator();
        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        Stack<Integer>stack = new Stack<>();
        stack.add(1);
        stack.add(3);

    }
}
