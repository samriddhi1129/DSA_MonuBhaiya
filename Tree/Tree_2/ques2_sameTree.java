
//  Definition for a binary tree node.
 class TreeNode {
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

public class ques2_sameTree{
    public boolean isSame(TreeNode root) {
        return same(root.left, root.right);

        
    }
    public boolean same(TreeNode r1, TreeNode r2){
        if(r1== null && r2 == null) return true;
         if(r1== null || r2 == null) return false;
         if(r1.val != r2.val) return false;
          boolean f1 = same(r1.left, r2.left);
          boolean f2 = same (r1.right, r2.right);
          return f1 &&  f2; 

    }
    public static void main(String[] args) {
         TreeNode root = new TreeNode(
                1,
                new TreeNode(
                        2,
                        new TreeNode(3),
                        new TreeNode(4)
                ),
                new TreeNode(
                        2,
                        new TreeNode(3),
                        new TreeNode(4)
                )
        );
           ques2_sameTree obj = new ques2_sameTree();
          System.out.println(obj.isSame(root));
    }
}