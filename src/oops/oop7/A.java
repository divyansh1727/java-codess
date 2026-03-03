package oops.oop7;
//human class

public class A implements Cloneable {
   static int[] arr;
    String name;
    int age;

    public A(String name, int age) {
        this.name = name;
        this.age = age;
        this.arr=new int[]{1,3,3,4};
    }
//override done to let jvm know that whether the clone object is allowed for override or not
    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
