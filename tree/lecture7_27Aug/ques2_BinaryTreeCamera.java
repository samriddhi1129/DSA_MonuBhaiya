import javax.swing.tree.TreeNode;

/**
 * ques2_installCamera
 */


public class ques2_BinaryTreeCamera {
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

     int camera = 0;
    public int minCameraCover(TreeNode root) {
        int x = minCamera(root);
        return x == -1? camera+1:camera;    
        
    }
    public int minCamera(TreeNode root){
        if(root == null) return 0; // camera ki jarurat ni h
        int left = minCamera(root.left);
        int right = minCamera(root.right);
        if(left == -1 || right == -1){
            camera++;
            return 1;
        }
        else if(left == 1 || right == 1) return 0;
        else return -1;
    }
}