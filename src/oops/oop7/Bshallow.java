package oops.oop7;
//human class

public class Bshallow implements Cloneable {
    String name;
    int age;
    int[] arr;

    public Bshallow(String name, int age) {
        this.name = name;
        this.age = age;
        this.arr= new int[]{1, 2, 3, 4};
    }
//override done to let jvm know that whether the clone object is allowed for override or not
    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
 