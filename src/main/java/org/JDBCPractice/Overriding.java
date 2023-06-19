package org.JDBCPractice;
class override {
     void data() {
        System.out.println("Bye");
    }
}
class override2 extends override{
    void data() {
        System.out.println("hi");
    }
}
class override3 extends override2{
    void data() {
        System.out.println("Varata mama durrrr...");
    }
}
public class Overriding extends override {
    public static void main(String[] args) {
        override override = new override2();
        override.data();
        override2 overridee = new override3();
        overridee.data();

    }
}
