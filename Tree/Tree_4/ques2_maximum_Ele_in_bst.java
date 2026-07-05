public class ques2_maximum_Ele_in_bst {
    public class TreeNode {
     int val;
     TreeNode left;
     TreeNode right;
    
    }
private TreeNode root;
public ques2_maximum_Ele_in_bst(int[] inorder){
        int maximum = max(root);
    }
    public int max(TreeNode node){

        if (node == null) return Integer.MIN_VALUE;
        int right = max(node.right);
        return Math.max(node.val, right);
    }
    
}
