package oops;

import oops.oops4.accessmod;

public class subclas extends accessmod {
    public subclas(int num, String name) {
        super(num, name);
    }

    public static void main(String[] args) {
        accessmod obj=new accessmod(1,"dh");
        int n= obj.getNum();
        System.out.println(obj.getClass());
    }
}
