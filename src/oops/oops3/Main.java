package oops.oops3;

public class Main {
    public static void main(String[] args) {
        //box1 gives all the given sided arg
        //box2 has the ref of box1

        box box1=new box(4,2,2);
        box box2=new box(box1);

        System.out.println(box2.l+" "+box2.b+" "+ box2.h);
    }
}
