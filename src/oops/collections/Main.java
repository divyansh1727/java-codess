package oops.collections;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        List<Integer> list2 = new LinkedList<>();
        list.add(23);
        list.add(23);
        list.add(23);
        list.add(23);

        list2.add(0,2);
        list2.add(1,2);
        list2.add(2,2);
        list2.add(3,8);
        System.out.println(list);
        System.out.println(list2);
        List<Integer> vector = new Vector<>();
        vector.add(23);
        vector.add(23);
        vector.add(23);
        System.out.println(vector);




    }
}
