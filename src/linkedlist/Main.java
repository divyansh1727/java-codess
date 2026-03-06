package linkedlist;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {

//        LinkedList<Integer> list=new LinkedList<>();
        LL list =new LL();
        list.insertfirst(3);
        list.insertfirst(32);
        list.insertfirst(1);
        list.insertfirst(2);
        list.insertlast(23);
        list.insertfirst(320);
        list.display();

    }
}
