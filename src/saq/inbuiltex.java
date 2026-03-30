package saq;

import java.util.*;

public class inbuiltex {
    public static void main(String[] args) {
//        Stack<Integer> stack=new Stack<>();
//        stack.push(12);
//        stack.push(1);
//        stack.push(2);
//        stack.push(4);
//        stack.push(6);
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        Queue<Integer> queue = new LinkedList<>();
//        queue.add(2);
//        queue.add(5);
//        queue.add(9);
//        queue.add(6);
//        System.out.println(queue.peek());
//        System.out.println(queue.remove());
        Deque<Integer> deque=new ArrayDeque<>();
        deque.add(22);
        deque.addLast(12);
        deque.removeFirst();
        deque.peek();
        System.out.println(deque);
//
 }
   }

