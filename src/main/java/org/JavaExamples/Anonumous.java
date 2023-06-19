package org.JavaExamples;
abstract class namd {
    abstract void display();
}
public class Anonumous {
    public static void main(String[] args) {
        namd obj = new namd() {
            @Override
            void display() {
                System.out.println("hi");
            }
        };
        obj.display();
    }
}
