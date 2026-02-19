package oops;

public class oop1 {
    public static void main(String[] args) {
//        oop1 obj = new oop1();
//        int a=10;
//        int b=20;
//
//        Integer num=34;
        //but when converted to Interger that is object we can swap, then also wont swap, as Integer cls is final class
        Integer a=122;
        Integer b=23;
        //num becomes the object class so has all the aceess same as a object has
        swap(a,b);
        //wont swap as in java not pass by reference
        System.out.println(a+" "+b);
       final A div=new A("divyan");
       div.name="rajput";
//       div=new A("xxhs");//this wont allow as final is been declared to A
        A obj;
        for (int i = 0; i <1000 ; i++) {
            obj=new A("randome");

        }



    }
   public static void swap(Integer a, Integer b){
        Integer temp=a;
        a=b;
        b=temp;
    }
//    Student[] students=new Student[5];
//
//    //    void message() {
////        //  Students students = new Students();
//    Student div = new Student("divy");
////        System.out.println(div.roll);;
////    }
//    class Student {
//        int roll;
//        String name;
//
//        Student(String divy) {
//            this.roll = 2;
//            this.name = "divy";
//
//        }
//
//        //  }
//        void greet() {
//            System.out.println("hello" + this.name);
//        }
//
//        void changename(String newname) {
//            this.name = newname;
//        }
//    }

    class A{
        final int num=12;
        String name;

    public A(String name) {
        System.out.println("obj created");
        this.name = name;
    }

        @Override
        protected void finalize() throws Throwable {
            System.out.println("obj destroyed");
        }
    }
}
