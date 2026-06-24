import java.util.*;
public class BinaryTreeImplementation {
    public class Node{
        int val;
        Node left;
        Node right;
    }
    private Node root;

    // creating bt

Scanner scan = new Scanner(System.in);
    public BinaryTreeImplementation(){
        root = createTree();

    }
    private Node createTree(){
        int item = scan.nextInt();
        Node nn = new Node();
        nn.val = item;
        boolean hlc = scan.nextBoolean();
        if(hlc){
            nn.left = createTree();
        }
        boolean hrc = scan.nextBoolean();
        if(hrc){
            nn.right = createTree();
        }
        return nn;
    }

    // displaying bt  [method overloading]
    public void Display(){
        Display(root);
    }
// method hiding 
    private void Display(Node node){
        if(node == null) return;
        String s = "";
        s = "<--"+node.val+"-->";
        if(node.left != null){
            s=node.left.val+s;

        }
        else{
            s="."+s;
        }

        if(node.right != null){
            s = s+ node.right.val;

        }
        else{
            s=s+".";
        }
        System.out.println(s);
    
    Display(node.left);
    Display(node.right);
    }


    // searching node in a tree

    public boolean find(int item){
        return find(this.root,item);
    }
    private boolean find(Node nn, int item){
        if(nn == null){
            return false;
        }
        if(nn.val == item){
            return true;
        }
        boolean left = find(nn.left, item);
        boolean right = find(nn.right, item);
        return left|| right;
    }

    // maximum element in tree
    public int max(){
        return max(this.root);
    }
    private int max(Node node){
        if(node == null){
            return Integer.MIN_VALUE;
        }
        int left = max(node.left);
        int right = max(node.right);
        return Math.max(node.val,Math.max(left,right));
    }
    
    // finding height of tree when assuming leaf node hight = 1;


    public int ht(){
        return ht(this.root);
    }
    private int ht(Node nn){
        if(nn == null){
            return 0;
        }
        int left = ht(nn.left);
        int right = ht(nn.right);
        return Math.max(left,right)+1;
    }

    // finding height of tree when assuming leaf node hight = 0;
        public int ht2(){
        return ht2(this.root);
    }
   private int ht2(Node nn){
        if(nn == null){
            return -1;
        }
        int left = ht2(nn.left);
        int right = ht2(nn.right);
        return Math.max(left,right)+1;
    }

    // preorder traversal

    public void preorder(){
        preorder(this.root);
    }
    private void preorder(Node node){
        if(node == null){
            return;
        }
        System.out.print(node.val +" ");
        preorder(node.left);
         preorder(node.right);
       
    }

    // postorder

  public void postorder(){
        postorder(this.root);
    }
    private void postorder(Node node){
        if(node == null){
            return;
        }
      
        postorder(node.left);
         postorder(node.right);
           System.out.print(node.val +" ");
        
    }

    // inorder
    
  public void inorder(){
        inorder(this.root);
    }
    private void inorder(Node node){
        if(node == null){
            return;
        }
      
        inorder(node.left);
         System.out.print(node.val +" ");
         inorder(node.right);
         
    }

    // level order  traversal

    public void levelOrder(){
        Queue<Node>q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            Node rv = q.poll();
            System.out.println(rv.val);
            if(rv.left!=null){
                q.add(rv.left);
            }
            if(rv.right!= null){
                q.add(rv.right);
            }
       
        }
    }





}
