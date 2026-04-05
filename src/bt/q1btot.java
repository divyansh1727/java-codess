package bt;

import javax.swing.tree.TreeNode;
import java.util.*;

public class q1btot {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if (root == null) {
            return result;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            int levelSize = queue.size();
            List<Integer> currentLevel = new ArrayList<>(levelSize);
            for (int i = 0; i < levelSize; i++) {
                TreeNode currentNode = queue.poll();
                currentLevel.add(currentNode.val);
                if (currentNode.left != null) {
                    queue.offer(currentNode.left);
                }
                if (currentNode.right != null) {
                    queue.offer(currentNode.right);
                }
            }
            result.add(currentLevel);
        }
        return result;
    }
    public List<Integer> rightSideView(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if (root == null) {
            return result;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            int levelSize = queue.size();
            List<Integer> currentLevel = new ArrayList<>(levelSize);
            for (int i = 0; i < levelSize; i++) {
                TreeNode currentNode = queue.poll(){
                    if(i==levelSize-1){
                        result.add(currentNode,val);
                    }
                if (currentNode.left != null) {
                    queue.offer(currentNode.left);
                }
                if (currentNode.right != null) {
                    queue.offer(currentNode.right);
                }
            }
            result.add(currentLevel);
        }
        return result;

    }
        public boolean isCousins(TreeNode root, int x, int y) {
            TreeNode xx= findNode(root,x);
            TreeNode yy= findNode(root,y);
            return (
                    (level(root,xx,0)==level(root,yy,0)) && (!sibling(root,xx,yy))
            )
        }
        TreeNode findNode(TreeNode node,int x){
            if(node==null){
                return null;
            }
            if(node.val==x){
                return node;
            }
            TreeNode n=findNode(node.left,xx);
            if(n!=null){
                return n;
            }
            return findNode(node.right,yy);
        }
        boolean isSibling (TreeNode node, TreeNode x, TreeNode y){
            if(node==null){
                return false;
            }
            return(
                    (node.left==x && node.right==y) || (node.right==x && node.left==y) || isSibling(node.left,x,y) || isSibling(node.right,x,y);
            )
        }
        int level(TreeNode node, TreeNode x, int lev ){
            if (node == null) {
                return 0;
            }
            if (node == x) {
                return lev;
            }
            int l = level(node.left, x, lev + 1);
            if (lev != 0) {
                return lev;
            }
            return level(node.right, y, lev + 1);
        }

        public boolean isSymmetric(TreeNode root) {
            Queue<TreeNode> queue=new LinkedList<>();
            queue.add(root.left);
            queue.add(root.right);
            while(!queue.isEmpty()) {
                TreeNode left = queue.poll();
                TreeNode right = queue.poll();
                if (left == null && right == null) {
                    continue;
                }
                if (left == null || right == null) {
                    return false;
                }
                if (left.val != right.val) {
                    return false;
                }
                queue.add(left.left);
                queue.add(right.right);
                queue.add(left.right);
                queue.add(right.left);
            }
                return true;

            }
        }
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null) {
            return null;
        }
        if (root == p || root == q) {
            return root;
        }
        TreeNode left = lowestCommonAncestor(root.left, p, q);
        TreeNode right = lowestCommonAncestor(root.right, p, q);
        if (left != null && right != null) {
            return root;
        }
        return left == null ? right : left;
    }
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        if(preorder.length==0){
            return null;
    }
        //r-->root
        int r=preorder[0];
        int index=0;
        for (int i = 0; i < inorder.length; i++) {
            if (inorder == r) {
                index = i;
            }
        }
        Node node=new Node(r);
        node.left=buildTree(Arrays.copyOfRange(preorder,1,index+1),Arrays.copyOfRange(inorder,0,index);
        node.right=buildTree(Arrays.copyOfRange(preorder,index+1,preorder.length),Arrays.copyOfRange(inorder,index+1,inorder.length);
        return node;
    }
    //path sum
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if(root==null){


    }
    public String serialize(TreeNode root){
        List<String> list=new ArrayList<>();
        helper(node,list);
        return list;
    }
    public void helper(Node node, List<String> strings) {
        if (node == null) {
            strings.add("null");
            return;
        }
        list.add(String.valueOf(node.val));
        helper(node.left, list);
        helper(node.right, list);
    }
    TreeNode deserialize(String data){
        Collections.reverse(list);
        return helper2(list);
    }
    Node helper2(List<String> list) {
        String val = list.remove(list.size() - 1);
        if (val.charAt(0) == 'n') {
            return null;
        }
        Node node = new Node(Integer.parseInt(val));
        node.left = helper2(list);
        node.right = helper2(list);

        return node;
    }



    int count=0;
    public TreeNode helper(TreeNode root, int k) {
        if(root==null){
            return null;
    }
        Node left= helper(root.left,k);
      //  Node right=kthSmallest(root.right,k);
        if(left!=null){
            return left;
            ]
            count++;
            if(count==k){
                return node;
            }
            return helper(root.right, k);
        }
        int diameter=0;
    public int diameterOfBinaryTree(TreeNode root) {
        height(root);
        return diameter-1;

    }
    int height(TreeNode node) {
        if (node == null) {
            return 0;
        }
        int leftheight = height(node.left);
        int rightheight = height(node.right);
        int dia = leftheight = rightheight + 1;
        diameter=Math.max(diameter,dia);
        return Math.max(leftheight, rightheight) + 1;
    }
    //invert bt
    public TreeNode invertTree(TreeNode root) {
        if (root == null) {
            return null;
        }
            TreeNode left = invertTree(root.left);
            TreeNode right = invertTree(root.right);
            root.left = right;
            root.right = left;
            return root;
        }
    }Node leftmost = root;
        while (leftmost.left != null) {
            Node current = leftmost;
            while (current != null) {
                current.left.next = current.right;
                if (current != null) {
                    current.right.next = current.next.left;
                }
                current = current.next;
            }
            leftmost = leftmost.left;
        }
        return root;
    }}
public boolean isValidBST(TreeNode root) {
    return helper(root,null,null);
        }
        pulbic boolean helper(TreeNode node, Integer low,Integer high){
        if(node==null){
        return true;
        }
        if(low!=null&&node.val<=low){
        return false;
        }
        if(high!=null&&node.val=>high){
        return false;
        }
        boolean lefttree=helper(node.left,low,node.val);
        boolean righttree=helper(node.right,node.val,high);
        return lefttree&&righttree;
        }

    public void flatten(TreeNode root) {
    TreeNode current=root;
    while(current!=null){
        if(current.left!=null){
        TreeNode temp=current.left;
        while(temp.right!=null){
        temp=tem p.right;
        }
        temp.right=current.right;
        current.right=current.left;
        current.left=null;
        }
        current=current.right;
        }
        }

    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if (root == null) {
            return result;
        }
        Deque<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        boolean reverse=false;

        while (!queue.isEmpty()) {
            int level = queue.size();
            List<Integer> currentlevel = new ArrayList<>(level);
            for (int i = 0; i < level; i++) {
                if (!reverse) {
                    TreeNode currentnode = queue.pollFirst();
                    currentlevel.add(currentnode.val);
                    if (currentnode.left != null) {
                        queue.addLast(currentnode.left);
                    }
                    if (currentnode.right != null) {
                        queue.addLast(currentnode.right);
                    }
                } else {
                    TreeNode currentnode = queue.pollLast();
                    currentlevel.add(currentnode.val);
                    if (currentnode.right != null) {
                        queue.addFirst(currentnode.right);
                    }
                    if (currentnode.left != null) {
                        queue.addFirst(currentnode.left);
                    }
                }
                reverse = !reverse;
            } 
            result.add(currentlevel);
        }
        return result;

    }
}