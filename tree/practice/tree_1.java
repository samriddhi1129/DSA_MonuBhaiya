import java.util.*;
public class tree_1 {
    // 10 true 20 true 40 false false true 50 false false true 30 false true 60 false false
    public class BinaryTree{
        public class Node{
            int val;
            Node left;
            Node right;
        }
        Scanner scan = new Scanner(System.in);
        private Node root;
        public  BinaryTree(){
            root = createtree();


        }
        private Node createtree(){
            int item = scan.nextInt();
            Node nn = new Node();
            nn.val = item;
            boolean hlc = scan.nextBoolean();
            if(hlc){
                nn.left = createtree();
            }
            boolean hrc = scan.nextBoolean();
            if(hrc){
                nn.right = createtree();
            }
            return nn;
        }

        public void display(){
            Display(root);
        }

        private void Display(Node root){
            if(root == null)return;
            String s = "";
           s="<-"+ root.val+"->";
            if(root.left != null){
                s= root.left.val +s;
            }
            else{
                s="."+s;
            }
            if(root.right != null){
                s=s+root.right.val;
            }
            else{
                s=s+".";
            }
            System.out.println(s);
            Display(root.left);
            Display(root.right);
        }
    }
    public static void main(String[] args) {
        tree_1 obj = new tree_1();
        BinaryTree bt = obj.new BinaryTree();
        bt.display();
      

        
    }

    
}