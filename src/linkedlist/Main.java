package linkedlist;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {

//LinkedList<Integer> list=new LinkedList<>();
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
        list.find(23);
        list.display();
        list.insertrec(5,1);
        list.display();
        //dll
//        dll list=new dll();
//        list.insertfirst(3);
//        list.insertfirst(32);
//        list.insertfirst(6);
//        list.insertfirst(1);
//        list.insertfirst(9);
//        list.insertlast(22);
//        list.insert(1,4);
//        list.display();
//        circular list=new circular();







    }
}
