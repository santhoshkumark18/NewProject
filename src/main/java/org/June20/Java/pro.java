package org.June20.Java;
class tom {
    protected int a=20;
    static void dis() {
        int b=20;
    }
}
public class pro {
    public static void main(String[] args) {
        tom obj = new tom();
        System.out.println(obj.a);
    }
}
