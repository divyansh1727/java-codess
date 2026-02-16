package oops;

public class oop1 {
    public static void main(String[] args) {
        oop1 obj = new oop1();
        obj.message();


    }
    void message() {
        //  Students students = new Students();
        Students div = new Students();
        System.out.println(div.name);
        System.out.println(div.roll);;
    }
    class Students {
        int roll;
        String  name;
        Students() {
            this.roll=2;
            this.name="divy";

        }
    }
}
