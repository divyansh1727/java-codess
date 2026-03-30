package saq;

public class StackMain {
    public static void main(String[] args) throws StackException {
        CustomStack stack=new DynamicStack(5);
        //        Stack<Integer> stack=new Stack<>();
        stack.push(12);
        stack.push(1);
        stack.push(2);
        stack.push(4);
        stack.push(6);
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());



    }
}
