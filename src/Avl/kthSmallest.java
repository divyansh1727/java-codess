package Avl;

import com.sun.source.tree.Tree;

import javax.swing.tree.TreeNode;
import java.util.PriorityQueue;

public class kthSmallest {
    private int k;
    private int ans;
    public int kthSmallest(TreeNode root, int k) {
        this.k=k;
        helper(root);
        return ans;
    }
    private void helper(TreeNode node){
        if(node==null){
            return ;
        }
        helper(node.left);
        k--;
        if (k ==0) {
          ans=node.val;
            return;

        }
        helper(node.right);

    }

    }
