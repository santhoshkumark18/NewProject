package org.June18.Java;
abstract  class an {
    static {
        System.out.println("bye");
    }
    abstract void dis();
}
public class Anonymous {
    public static void main(String[] args) {
        an ob = new an() {
            @Override
            void dis() {
                System.out.println("hi");
            }
        };
        ob.dis();
    }
}
