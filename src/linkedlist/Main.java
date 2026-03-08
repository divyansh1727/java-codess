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
        list.insertfirst(320);
        list.insert(99,3);
        list.insertlast(23);
        System.out.println(list.deletefirst());
        System.out.println(list.deletelast());
        System.out.println(list.delete(4));
        list.display();

    }
}
