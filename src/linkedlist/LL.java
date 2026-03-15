package linkedlist;

public class LL {
    private Node head;
    private Node tail;
    private int size;
    public LL(){
        this.size=0;
    }

    public void insertfirst(int val){
        Node node=new Node(val);
        node.next=head;
        head=node;
        if(tail==null){
            tail=head;
        }
        size+=1;
    }

    public void insertlast(int val){
        if(tail==null){
            insertfirst(val);
            return;
        }
        Node node=new Node(val);
        tail.next=node;
        tail=node;
            size++;
    }
    public void insert(int val, int index){
        if(index==0){
            insertfirst(val);
            return;
        }
        if(index==size){
            insertlast(val);
            return ;
        }
        Node temp=head;
        for (int i = 1; i < index; i++) {
            temp=temp.next;

        }
        Node node=new Node(val,temp.next);
        temp.next=node;
        size++;

    }
    public Node get(int index){
        Node node=head;
        for (int i = 0; i < index; i++) {
            node=node.next;

        }
        return node;
    }
//find node
    public Node find(int value){
        Node node=head;
        while(node!=null){
            if(node.value==value){
                return node;
            }
            node=node.next;
        }
        return null;
    }
    //delete through indexes
    public int delete(int index){
        if(index==0){
            return deletefirst();
        }
        if(index==size-1){
            return deletelast();
        }
        Node prev=get(index-1);
        int val=prev.next.value;
        //to avoid the chain and delete the item without making chain and get connected directly to the next node
        prev.next=prev.next.next;
        return val;
    }

    public int deletefirst(){
        int val=head.value;
        head=head.next;
        if(head==null){
            tail=null;
        }
        size--;
        return val;
    }
    //insert using recursion
    //Q1
    public void insertrec(int val,int index){
        head=insertrec(val,index,head);

    }
    private Node insertrec(int val, int index, Node node){
        if(index==0){
            Node temp=new Node(val,node);
            size++;
            return temp ;
        }
        node.next= insertrec(val,index-1,node.next);
        return node;
    }

    public int deletelast() {
        if (size <= 1) {
            return deletefirst();
        }
        Node secondlast = get(size - 2);
        int value = tail.value;
        tail = secondlast;
        tail.next = null;
        return value;
    }

    public void display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.value+"->");
            temp=temp.next;
        }
        System.out.println("end");

    }

    private class Node {
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }
        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }
    //questions
    //dupliacte
    public void duplicate(){
        Node node=head;
        while(node.next!=null){
            if(node.value==node.next.value){
                node.next=node.next.next;
                size--;
            }else {
                node=node.next;
            }
        }
        tail=node;
        tail.next=null;
    }
    //q3. merge
    public static LL mergelist(LL first, LL second){
        Node f=first.head;
        Node s= second.head;
        LL ans=new LL();
        while(f!=null && s!=null){
            if(f.value<s.value){
                ans.insertlast(f.value);
                f=f.next;
            }else{
                ans.insertlast(s.value);
                s=s.next;
            }
        }
        while(f!=null){
            ans.insertlast(f.value);
            f=f.next;
        }
        while(s!=null) {
            ans.insertlast(s.value);
            s = s.next;
        }
        return ans;

    }

    public static void main(String[] args) {
//        LL list=new LL();
//        list.insertlast(1);
//        list.insertlast(1);
//        list.insertlast(1);
//        list.insertlast(2);
//        list.insertlast(4);
//        list.insertlast(4);
//        list.display();
//        list.duplicate();
//        list.display();
        LL first=new LL();
        LL second=new LL();
        first.insertlast(1);
        first.insertlast(3);
        first.insertlast(5);
        second.insertlast(1);
        second.insertlast(2);
        second.insertlast(9);
        second.insertlast(14);
        LL ans=LL.mergelist(first,second);
        ans.display();




    }
    
}