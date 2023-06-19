package org.June18.Java;

class  C{
    public void dis() {
        System.out.println("Hi");
    }
}
class D extends C {
    public  void dis() {
        System.out.println("bye");
    }
}
public class MethodOverriding {
    public static void main(String[] args) {
        D obj = new D();
        obj.dis();
    }
}
