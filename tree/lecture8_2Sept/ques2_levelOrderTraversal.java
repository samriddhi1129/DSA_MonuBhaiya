import java.util.*;
public class ques2_levelOrderTraversal {
    class Node{
        int val;
        Node left;
        Node right;
        public Node(int val){
            this.val = val;
        }
    }
    private Node root;
    public Create_level_Order_Input_Tree(){
        CreateTree();
    }
    private void CreateTree(){
        Scanner scan = new Scanner(System.in);
        int item = scan.nextInt();
        Node nn = new Node(item);
        root = nn;
        Queue<Node> q = new LinkedList<>();
        q.add(nn);
        while(!q.isEmpty()){
            Node r = q.poll();
            int c1 =scan.nextInt();
            int c2 = scan.nextInt();
            if(c1!=-1){
                Node n = new Node(c1);
                r.left = n;
                q.add(n);
            }
            if(c2!=-1){
                Node n = new Node(c2);
                r.right = n;
                q.add(n);
            }
        }
    }
    public static void main(String[] args) {

        
    }
    
}
