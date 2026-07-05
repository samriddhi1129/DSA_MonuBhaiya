package Tree_3;
import java.util.*;
public class q3_creatingTree_LEvelOrderTraversal {
     public class TreeNode {
     int val;
     TreeNode left;
     TreeNode right;
     }
     TreeNode root;
     Scanner scan = new Scanner(System.in);

     public q3_creatingTree_LEvelOrderTraversal(){
        root = buildTree();
     }
     public TreeNode buildTree(){
        int item = scan.nextInt();
        TreeNode node = new TreeNode();
        node.val=item;
        root = node;
        Queue<TreeNode>q = new LinkedList<>();
        q.add(node);
        while(!q.isEmpty()){
            TreeNode rv = q.poll();
            int c1 = scan.nextInt();
            int c2 =scan.nextInt();
            if(c1!=-1){
                TreeNode n = new TreeNode();
                n.val=c1;
                rv.left=n;
               
                q.add(n);
            }
            if(c2!=-1){
                TreeNode n = new TreeNode();
                n.val=c2;
                rv.left=n;
                q.add(n);
            }
        }
        return root;
     }

}
    

