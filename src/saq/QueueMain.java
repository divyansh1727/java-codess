package saq;

public class QueueMain {
    public static void main(String[] args) throws Exception {
        Circularqueue queue = new Circularqueue(5);
        queue.insert(3);
        queue.insert(6);
        queue.insert(5);
        queue.insert(19);
        queue.insert(1);

        queue.display();


    }
}