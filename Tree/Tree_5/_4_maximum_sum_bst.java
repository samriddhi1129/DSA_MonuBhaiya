import javax.swing.tree.TreeNode;

public class _4_maximum_sum_bst {
    
//  Definition for a binary tree node.
 public class TreeNode {
     int val;
     TreeNode left;
     TreeNode right;
     TreeNode() {}
     TreeNode(int val) { this.val = val; }
     TreeNode(int val, TreeNode left, TreeNode right) {
         this.val = val;
         this.left = left;
         this.right = right;
     }
 }

class Solution {
    public int maxSumBST(TreeNode root) {
        return valid(root).ans;   
        
    }

class bstpair{
      boolean isbst = true;
        long min = Long.MAX_VALUE;
        long max = Long.MIN_VALUE;
        int sum =0;
        int ans =0;
}
    public bstpair valid(TreeNode root){
        if(root == null){
            return new bstpair();
        }
        bstpair left = valid(root.left);
        bstpair right = valid(root.right);
        bstpair self = new bstpair();
        self.min= Math.min(root.val,Math.min(left.min, right.min));
        self.max = Math.max(root.val, Math.max(left.max, right.max));
        self.isbst = left.isbst && right.isbst && root.val > left.max && root.val < right.min;

        self.sum = left.sum+right.sum+root.val;

        if(self.isbst){
            self.ans = Math.max(self.sum, Math.max(left.ans, right.ans));
        }
        else{
            self.ans = Math.max(left.ans, right.ans);
        }
        return self;

    }
}
    
}
