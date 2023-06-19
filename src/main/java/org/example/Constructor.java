package org.example;
class exammarks {
    int mark1,mark2;
    public exammarks(int mark1,int mark2) {
        this.mark1=mark1;
        this.mark2=mark2;
    }
}
public class Constructor {
    public static void main(String[] args) {
        exammarks obj = new exammarks(100,80);
        System.out.println(obj.mark1);
        System.out.println(obj.mark2);
    }


}
