
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

public class ques3_similarTree{
    public boolean isSimilar(TreeNode root) {
        return similar(root.left, root.right);

        
    }
    public boolean similar(TreeNode r1, TreeNode r2){
        if(r1== null && r2 == null) return true;
         if(r1== null || r2 == null) return false;
  
          boolean f1 = similar(r1.left, r2.right);
          boolean f2 = similar (r1.right, r2.left);
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
            ques3_similarTree obj = new  ques3_similarTree();
          System.out.println(obj.isSimilar(root));
    }
}