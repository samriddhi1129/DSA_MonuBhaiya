public class _3_largest_bst_subtree {
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
     class bstPair{
        boolean isbst = true;
        long min = Long.MAX_VALUE;
        long max = Long.MIN_VALUE;
        int size =0;
    }
    public int isValidBST(TreeNode root) {
        return valid(root).size;
        
    }
    public bstPair valid(TreeNode root){
        if(root == null){
            return new bstPair();
        }
        bstPair left = valid(root.left);
        bstPair right = valid(root.right);
        bstPair self = new bstPair();
        self.min= Math.min(root.val,Math.min(left.min, right.min));
        self.max = Math.max(root.val, Math.max(left.max, right.max));
        self.isbst = left.isbst && right.isbst && root.val > left.max && root.val < right.min;

        if(self.isbst){
            self.size = left.size+right.size+1;
        }
        else{
            self.size=Math.max(left.size, right.size);
        }
        return self;

    }

    
}
