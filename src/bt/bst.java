package bt;

import org.w3c.dom.Node;

import java.util.Scanner;

public class bst {
    public class Node{
        private int value;
        private int height;
        private Node left;
        private Node right;

        public Node(int value){
            this.value=value;
        }
        public int getValue() {
            return value;
        }
    }
    private Node root;
    public bst(){
        
    }
    public int height(Node node){
        if(node==null){
            return -1;
        }
        return node.height;
    }
    public boolean isEMPTY(){
        return root==null;
    }
    public void insert(int value){
        root=insert(value, root);

    }
    private Node insert(int value, Node node){
        if(node==null){
            node =new Node(value);
            return node;
        }
        if(value<node.value){
            node.left=insert(value, node.left);

        }
        if(value>node.value){
            node.right=insert(value, node.right);

        }
        node.height=Math.max(height(node.left),height(node.right))+1;
        return node;
    }
    public void populate(int[] nums){
        for (int i = 0; i < nums.length ; i++) {
            this.insert(nums[i]);

        }
    }
    public void populatesorted(int[] nums){
        populatesorted(nums,0,nums.length);
    }
    private void populatesorted(int[] nums, int start, int end){
        if (start == end) {

            return;
        }
        int mid=(start+end)/2;
        this.insert(nums[mid]);
        populatesorted(nums,start,mid);
        populatesorted(nums,mid+1,end);

    }
    public boolean balanced(){
        return balanced(root);
    }
    public boolean balanced(Node node){
        if(node==null){
            return true;
        }
        return Math.abs(height(node.left)-height(node.right))<=1 &&balanced(node.left) && balanced(node.right);

    }
    public void display(){
        display(this.root,"root node: ");
    }
    private void display(Node node, String details){
        if(node==null){
            return;
        }
        System.out.println(details+node.value);
        display(node.left,"this is left child of"+node.value+" : ");
        display(node.right,"this is right child of"+node.value+" : ");

    }

    public static void main(String[] args) {
       bst tree=new bst();
       int[] nums={1,2,67,4,7,8,12};
       tree.populatesorted(nums);
       tree.display();
    }
}
//time comp.= n*logn