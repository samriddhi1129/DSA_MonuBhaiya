public class Creating_BST_using_Inorder {
    public class TreeNode {
     int val;
     TreeNode left;
     TreeNode right;
    
    }
private TreeNode root;
public Creating_BST_using_Inorder(int[] inorder){
        root = createTree(inorder, 0, inorder.length - 1);
    }

    public TreeNode createTree(int[] inorder, int si, int ei){
        if(si>ei){
            return null;
        }
        int mid = (si+ei)/2;
        TreeNode nn = new TreeNode();
        nn.val = inorder[mid];
        nn.left=createTree(inorder,si,mid-1);
        nn.right = createTree(inorder,mid+1,ei);
        return nn;
        
    }

    public void inorder(TreeNode root) {
    if (root == null)
        return;

    inorder(root.left);
    System.out.print(root.val + " ");
    inorder(root.right);
}

    public static void main(String[] args) {
        
    int[] inorder={10,20,30,40,50};
    Creating_BST_using_Inorder bst = new Creating_BST_using_Inorder(inorder);
    bst.inorder(bst.root);
    
    }

    
}
