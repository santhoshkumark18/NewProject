package org.June18.Java;

class Santhosh {
    private static Santhosh obj;
    private Santhosh() {

    }
    public static Santhosh getInstance() {
        if(obj==null) {
            obj=new Santhosh();
        }
        return obj;
    }
}

public class privateCons {
    public static void main(String[] args) {
    }
}
