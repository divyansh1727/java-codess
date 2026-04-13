import javax.swing.tree.TreeNode;
import java.util.ArrayList;
import java.util.HashMap;
//105
public class ques {
    int[] index = {0};

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < inorder.length; i++) {
            map.put(inorder[i], i);
        }

        return helper(preorder, inorder, 0, inorder.length - 1, map, index);
    }

    public TreeNode helper(int[] preorder, int[] inorder, int left, int right,
                           HashMap<Integer, Integer> map, int[] index) {

        if (left > right) return null;

        int current = preorder[index[0]];
        index[0]++;

        TreeNode node = new TreeNode(current);

        int currentIndexInorder = map.get(current);

        node.left = helper(preorder, inorder, left, currentIndexInorder - 1, map, index);
        node.right = helper(preorder, inorder, currentIndexInorder + 1, right, map, index);

        return node;
    }
}
