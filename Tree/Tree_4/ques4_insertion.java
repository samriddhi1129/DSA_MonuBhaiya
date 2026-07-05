

public class ques4_insertion {
 
      public class TreeNode {
     int val;
     TreeNode left;
     TreeNode right;
    
    }
    private TreeNode root;
    ques4_insertion(){
        TreeNode ans = insertIntoBST( root, 36);
    }
     public TreeNode insertIntoBST(TreeNode root, int val) {
        if(root == null) return new TreeNode(val);
        if(val> root.val){
            root.right = insertIntoBST(root.right,val);
        }
        else{
            root.left = insertIntoBST(root.left,val);
        }
        return root;
        
    }
    public static void main(String[] args) {
        
        
    }

}
    

