package bt.pathsum;

import javax.swing.tree.TreeNode;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Stack;

public class ps1 {
    public boolean hasPathSum(TreeNode root, int sum) {
        if(root==null){
            return false;
        }
        if(root.val==sum && root.left==null && root.right==null){
            return true;
        }
        return hasPathSum(root.left,sum-root.val)|| hasPathSum(root.right,sum-root.val);

        }
        //2
    public int sumNumbers(TreeNode root) {
        return helper(root,0);
        }
        int helper(TreeNode node, int sum){
        if(node==null){
            return 0;
        }
        sum=sum*10+node.val;
        if(node.left==null && node.right==null){
            return sum;
        }
        return helper(node.left,sum)+helper(node.right, sum);
    }
    //3
    int ans=Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
        helper(root);
        return ans;
        }
        int helper(TreeNode node){
            if(node==null){
                return 0;
            }
            int left=helper(node.left);
            int right=helper(node.right);
            left=Math.max(0,left);
            right=Math.max(0,right);

            int pathmax=left+right+node.val;
            ans=Math.max(ans,pathmax);
            return Math.max(left,right)+node.val;
    }
    //4
    boolean findpath(Node node, int[] arr){
        if(node==null){
            return arr.length==0;
        }
        return helper(node,arr,0);
    }
    boolean helper(Node node , int[] arr, int index){
        if(node==null){
            return false;
        }
        if(index==arr.length || node.val!=arr[index]){
            return false;
        }
        if(node.left ==null && node.right==null && index=arr.length-1){
            return true;
        }
        return helper(node.left,arr, index+1) || helper(node.right,arr,index+1);
    }
    //5
    int countpath(Node node, int sum){
        List<Integer> path=new ArrayList<>();
        return helper(node,sum,path);
    }
    //tc=nlogn
    //sc=logn

    int hrlper(Node node, int sum, List<Integer> path){
        if(node==null){
            return 0;
        }
        path.add(node.val);
        int count=0;
        int s = 0;

        //how many path can one make
        ListIterator<Integer> itr=path.listIterator(path.size());
        while(itr.hasPrevious()) {
            sum += itr.previous();

            if (s == sum) {
                count++;
            }
        }
        count += helper(node.left,sum,path)+helper(node.right,sum,path);
        //backtrack
        path.remove(path.size()- 1);
        return count;

    }//now find the paths
    List<List<Integer>> findpath(Node node, int sum){
        List<List<Integer>> paths=new ArrayList<>();
        helper(node,sum,path);
        return paths;
    }
    //tc=logn
    //sc=logn
    int helper(Node node, int sum, List<Integer> path,List<List<Integer>> paths) {
        if (node == null) {
            return 0;
        }
        path.add(node.val);
        if (node.val == sum && node.left == null && node.right == null) {
            paths.add(new ArrayList<>(path));
        } else {
            helper(node.left, sum - node.val, path, paths);
            helper(node.right, sum - node.val, path, paths);

        }
        //backtrack
        path.remove(path.size() - 1);
    }
    //dfs using stack
    void dfsstack(Node node){
        if(node==null){
            return ;
        }
        Stack<Node> stack=new Stack<>();
        stack.push(node);
        while(!stack.isEmpty()){
            Node removed=stack.pop();
            System.out.print(removed.val+" ");
            if(removed.right!=null){
                stack.push(removed.right);
            }
            if(removed.leftt!=null){
                stack.push(removed.left);
            }
        }

    }

}
