import java.util.ArrayList;
import java.util.List;

public class ques7_rightSideView {
    int visited = -1;
         
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> ll = new ArrayList<>();
        view(root,0,ll);
        return ll;     
        
    }
    public void view(TreeNode root, int curr, List<Integer> ll){
        if(root == null) return;
        if(curr>visited){
            ll.add(root.val);
            visited  = curr;
        }
        view(root.right, curr+1, ll);
         view(root.left, curr+1, ll);

    }
    
}
