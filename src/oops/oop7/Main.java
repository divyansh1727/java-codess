package oops.oop7;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException{
        A div=new A("dd",2);
        A sdn=(A)div.clone();
        System.out.println(sdn.name+" "+sdn.age);
        sdn.arr[0]=12;
        System.out.println(Arrays.toString(A.arr));
        System.out.println(Arrays.toString(sdn.arr));


    }
}
