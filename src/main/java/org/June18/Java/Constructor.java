package org.June18.Java;
class A {
   public void dis() {
        System.out.println("hi");
    }
}
class B extends A {
   public void dis() {
        System.out.println("bye");
    }
}
public class Constructor {
    public static void main(String[] args) {
        B obj = new B();
        obj.dis();
    }

}
