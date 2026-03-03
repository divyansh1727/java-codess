package oops.oops6;

import java.util.ArrayList;
import java.util.function.Consumer;

public class lambdafun {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            arr.add(i + 1);

        }
//        arr.forEach((item)-> System.out.println(item*2));
        Consumer<Integer> fun = (item) -> System.out.println(item * 2);
        arr.forEach(fun);}
        operation sum =(a, b)-> a+b;
        operation sub =(a, b)-> a-b;
        operation mul =(a, b)-> a*b;
        operation div =(a, b)-> a/b;
        }
        //for mulitple create interface
        interface operation {
        int sum(int a, int b);
    }