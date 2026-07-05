package Tree_3;


public class diameterApproach2_optimised {
     
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

 class DiaPair{
        int dt =0;
        int ht = -1;
    }
    public int diameterOfBinaryTree(TreeNode root) {
        return diameter(root).dt;
        
    }
    public DiaPair diameter(TreeNode root){
        if(root == null) return new DiaPair();
    
    DiaPair ldp = diameter(root.left);
     DiaPair rdp = diameter(root.right);
     DiaPair sdp = new DiaPair();
     int sd = ldp.ht+rdp.ht+2;
     sdp.dt=Math.max(Math.max(ldp.dt,rdp.dt),sd);
     sdp.ht=Math.max(ldp.ht,rdp.ht)+1;
     return sdp;
}
}

    

