public class _1_construct_bt_using_inorder_pre_order{
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
public TreeNode buildTree(int[] preorder, int[] inorder) {
        return createTree(preorder, inorder,0, inorder.length-1, 0, preorder.length-1);
        
    }

    public TreeNode createTree(int[] preorder, int[] inorder, int ilo, int ihi, int plo, int phi){
        if(ilo>ihi || plo>phi) return null;
        TreeNode node = new TreeNode(preorder[plo]);
        int idx = search(inorder, ilo, ihi, preorder[plo]);
        int net = idx-ilo;
        node.left = createTree(preorder,inorder,ilo, idx-1,plo+1,plo+net);
        node.right = createTree(preorder, inorder,idx+1,ihi,plo+net+1,phi);
        return node;
    }
    public int search(int[] inorder, int si, int ei, int item){
        for(int i =si; i<=ei; i++){
            if(inorder[i] == item) return i;
            
        }
        return -1;
    }
}