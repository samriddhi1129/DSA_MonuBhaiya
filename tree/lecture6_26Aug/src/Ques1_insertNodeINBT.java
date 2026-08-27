public class Ques1_insertNodeINBT {
    public  TreeNode insertNode(TreeNode root, int val){
        if(root == null){
            return new TreeNode(val);
        }
        if(root.val < val){
            root.right = insertNode(root.right,val);

        }
        else{
            root.left = insertNode(root.left,val);
        }
        return root;
    }
    public static void main(String[] args) {

    }
}
