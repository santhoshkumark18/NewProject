package org.Before;
class no {
    private void dis() {
        System.out.println("sout");
    }
    protected void display() {
        System.out.println("hi");
    }
    void displ() {
        System.out.println("Bye");
    }
}

public class member {
    public static void main(String[] args) {
        no obj = new no();
        obj.display();
        obj.displ();
    }
}
