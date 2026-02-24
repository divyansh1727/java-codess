package oops.oops5;

public class Son extends absdemo{
    public Son(int age) {
        super(age);
//        this.age=age;
    }


    @Override
    void career() {
        System.out.println("doc");

    }

    @Override
    void partner() {
        System.out.println("no");

    }
}
