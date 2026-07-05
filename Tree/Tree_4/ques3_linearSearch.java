import org.w3c.dom.Node;

public class ques3_linearSearch {
      public class TreeNode {
     int val;
     TreeNode left;
     TreeNode right;
    
    }
private TreeNode root;
ques3_linearSearch(){
   boolean isAvailable =  find(root, 55);
} 
    public boolean find(TreeNode nn, int item){
        if(nn== null)return false;
        if(nn.val == item) return true;
        else if(nn.val>item) return find(nn.left,item);
        else return find(nn.right,item);
    }
    
}
