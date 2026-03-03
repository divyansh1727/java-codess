package oops.oop7;
//human class

public class deep implements Cloneable {
   int[] arr;
    String name;
    int age;

    public deep(String name, int age) {
        this.name = name;
        this.age = age;
        this.arr=new int[]{1,3,3,4};
    }
//override done to let jvm know that whether the clone object is allowed for override or not
    @Override
    public Object clone() throws CloneNotSupportedException {
        //deep cloning
        A sdn=(A)super.clone();
        //making dc
        sdn.arr=new int[sdn.arr.length];
        System.arraycopy(this.arr, 0, sdn.arr, 0, sdn.arr.length);
        return sdn;
    }

}
