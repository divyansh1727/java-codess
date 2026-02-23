package oops.oops3inh;

public class Main {
    public static void main(String[] args) {
        //box1 gives all the given sided arg
        //box2 has the ref of box1
        boxweight box3=new boxweight(2,2,2,2);
        System.out.println(box3.h+" "+box3.w+" "+box3.l+" "+box3.b);

//        box box1=new box(4,2,2);
//        box box2=new box(box1);
//
//        System.out.println(box2.l+" "+box2.b+" "+ box2.h);
        box box5=new boxweight(2,2,2,2);
//        System.out.println(box5.w);
        //this wont work as box6 whats the boxwieght class to refer to parent class attr
//        boxweight box6=new box(2,2,1);
//        System.out.println(box6.l);
    }
}
