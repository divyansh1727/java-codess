package linkedlist;

public class dll {
    private Node head;
    public void insertfirst(int val){
        Node node=new Node(val);
        node.next=head;
        node.prev=null;
        if(head!=null) {
            head.prev = node;
        }
        head=node;
    }
    public void display(){
        Node node=head;
        Node last=null;
        while(node!=null){
            System.out.print(node.val+"->");
            last=node;
            node=node.next;
        }
        System.out.println("END");
        //for rev printing
        System.out.println("print in rev");
        while(last!=null){
            System.out.print(last.val+"->");
            last=last.prev;
        }
        System.out.println("END");

    }
    public void insertlast(int val){
        Node node=new Node(val);
        Node last=head;
        if(head==null){
            node.prev=null;
            head=node;
            return;
        }
        while(last.next!=null){
            last=last.next;
        }
        last.next=node;
        node.prev=last;
    }
    public Node find(int value){
        Node node=head;
        while(node!=null){
            if(node.val==value){
                return node;
            }
            node=node.next;
        }
        return null;
    }
    //inserting in between or after certain value
    public void insert(int after , int val){
        //p--previous
        Node p=find(after);
        if(p==null){
            System.out.println("doesnot exist");
            return;
        }
        Node node=new Node(val);
        node.next=p.next;
        p.next=node;
        node.prev=p;
        if(node.next!=null) {
            node.next.prev = node;
        }
    }
    private class Node {
        private int val;
        private Node next;
        private Node prev;
        public Node(int val) {
            this.val = val;

        }
    }
}
