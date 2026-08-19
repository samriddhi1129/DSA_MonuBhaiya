package lecture2;

import javax.swing.tree.TreeNode;

public class q6_symmetricTree {public boolean isSymmetric(TreeNode root) {
        return Symmetric(root.left, root.right);
        
    }
    public boolean Symmetric(TreeNode l, TreeNode r){
        if(l == null && r== null) return true;
        if(l == null || r== null) return false;
        if(l.val  != r.val) return false;

         boolean left = Symmetric(l.left, r.right);
         boolean right = Symmetric(l.right, r.left);
         return left && right;
    }
    
}
