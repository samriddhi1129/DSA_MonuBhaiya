public class ques6_sumRootToLeaf {
    public int sumNumbers(TreeNode root) {
        return sum( root, 0);
        
    }
    public int sum(TreeNode root, int num){
        if(root == null) return 0;
        if(root.left == null && root.right == null) return num*10+root.val;
    
    int left = sum(root.left, num*10+root.val);
    int right = sum(root.right, num*10+root.val);
    return left+right;
    }
    
}
