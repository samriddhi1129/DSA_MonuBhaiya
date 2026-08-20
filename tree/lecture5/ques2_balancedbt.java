package lecture5;

import javax.swing.tree.TreeNode;

public class ques2_balancedbt {
    public boolean isBalanced(TreeNode root) {
        return Balanced(root).isbal;
        
    }
    class pair{
        boolean isbal=true;
        int ht =-1;
    }
    public pair Balanced(TreeNode root){
        if(root == null) return new pair();
        pair l = Balanced(root.left);
        pair r = Balanced(root.right);
        pair s = new pair();
        s.ht=Math.max(l.ht,r.ht)+1;
        boolean sb = Math.abs(l.ht-r.ht)<=1;
        s.isbal=l.isbal && r.isbal && sb;
        return s;
    }
    
}
