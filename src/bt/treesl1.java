package bt;

import java.util.Scanner;

//binary tree
public class treesl1 {
    public treesl1() {
    }
    private static class Node{
        int value;
        Node left;
        Node right;
        public Node(int value) {
            this.value = value;
        }
        }
    private Node root;
    public void insert (Scanner scanner){
        System.out.println("enter the root node:");
        int value=scanner.nextInt();
        root=new Node(value);
        insert(scanner,root);
    }
    private void insert(Scanner scanner, Node node){
        System.out.println("do u want to enter left of"+ node.value);
        boolean left=scanner.nextBoolean();
        if(left){
            System.out.println("enter the value for the left node"+ node.value);
            int value=scanner.nextInt();
            node.left=new Node(value);
            insert(scanner,node.left);
        }
        System.out.println("do u want to enter right of"+ node.value);
        boolean right=scanner.nextBoolean();
        if(right){
            System.out.println("enter the value for the right node"+ node.value);
            int value=scanner.nextInt();
            node.right=new Node(value);
            insert(scanner,node.right);
        }

    }
    public void display(){
        display(this.root,"");
    }
    private void display(Node node,String indent) {
        if (node == null) {
            return;
        }
            System.out.println(indent + node.value);
            display(node.left , indent + "\t");
            display(node.right , indent + "\t");
        }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        treesl1 tree=new treesl1();
        tree.insert(scanner);
        tree.prettyDisplay();

    }
    public void prettyDisplay(){
        prettyDisplay(root,0);
    }
    private void prettyDisplay(Node node, int level) {
        if(node==null){
            return;
        }
        prettyDisplay(node.right, level+1);
        if(level!=0){
            for (int i = 0; i <level-1 ; i++) {
                System.out.print("|\t\t");
            }
            System.out.println("|------>"+node.value);
        }else{
            System.out.println(node.value);
        }
        prettyDisplay(node.left,level+1);

    }
    public void preorder(){
        preorder(root);
    }
    private void preorder(Node node){
        if(node==null){
            return;
        }
        System.out.println(node.value+" ");
        preorder(node.left);
        preorder(node.right);
    }
    public void inorder(){
        preorder(root);
    }
    private void inorder(Node node){
        if(node==null){
            return;
        }
        preorder(node.left);
        System.out.println(node.value+" ");
        preorder(node.right);
    }
    public void postorder(){
        preorder(root);
    }
    private void postorder(Node node){
        if(node==null){
            return;
        }
        preorder(node.left);
        preorder(node.right);
        System.out.println(node.value+" ");
    }

}
