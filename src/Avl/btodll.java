package Avl;

public class btodll {
    LLNode head;
    LLNode tail;
    public LLNode convert(TreeNode root){
        if(root==null){
            return null;
        }
        helper(root);
        return head;
    }
    private void helper(TreeNode node){
        if(node==null){
            return null;
        }
        helper(node.left);
        LLNode newnde=new LLNode(node.val);
        if(head==null){
            head=newnde;
            tail= newnde;
        }
        else{
            tail.next=newnde;
            newnde.prev=tail;
            tail=newnde;
        }
        helper(node.right);
    }
}
class LLNode {
    int val;
    LLNode prev;
    LLNode next;

    public LLNode(int val) {
        this.val = val;
    }
}
class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;
    public TreeNode(int val){
        this.val= val;
    }
}