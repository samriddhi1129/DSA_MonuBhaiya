public class ques5_deletion {
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
    public TreeNode deleteNode(TreeNode root, int key) {
        if(root == null) return null;

        if(root.val<key){
            root.right = deleteNode(root.right,key);
        }
        else if(root.val>key){

            root.left = deleteNode(root.left,key);
        }
        else{
            //deletion

            //0 or  1  child or 2 child

            if(root.left == null) return root.right;
            else if(root.right == null) return root.left;
            else{
                // 2 child
                int max = max(root.left);
                root.left=deleteNode(root.left,max);
                root.val = max;
            }

        }
        return root;
    }

    public int max(TreeNode nn){
        if(nn == null) return Integer.MIN_VALUE;
        int r = max(nn.right);
        return Math.max(r,nn.val);
    }
    
}
}
