
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

public class ques1_symmetricTree{
    public boolean isSymmetric(TreeNode root) {
        return symmetric(root.left, root.right);

        
    }
    public boolean symmetric(TreeNode r1, TreeNode r2){
        if(r1== null && r2 == null) return true;
         if(r1== null || r2 == null) return false;
         if(r1.val != r2.val) return false;
          boolean f1 = symmetric(r1.left, r2.right);
          boolean f2 = symmetric (r1.right, r2.left);
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
                        new TreeNode(5),
                        new TreeNode(3)
                )
        );
           ques1_symmetricTree obj = new ques1_symmetricTree();
          System.out.println(obj.isSymmetric(root));
    }
}

