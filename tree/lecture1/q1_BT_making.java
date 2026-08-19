import java.util.*;
public class q1_BT_making{

    // construction of tree

    private class Node{
    int val;
    Node left;
    Node right;
    public Node(int val){
        this.val = val;
    }
}
private Node root;
Scanner scan = new Scanner(System.in);
public q1_BT_making(){
    root =CreateTree();

}
private Node CreateTree(){
    // 10 T 20 T 40 F F F T 30 F T 50 F  F
   int val = scan.nextInt();
   Node nn = new Node(val);
   boolean hlc = scan.nextBoolean();
   if(hlc){
    nn.left = CreateTree();
   }
   boolean hrc = scan.nextBoolean();
   if(hrc){
    nn.right = CreateTree();
   }
   return nn;

}

// displaying tree
public void Display(){
    Display(root);
}

private void Display(Node nn){
    if(nn == null){
        return;
    }
    String s = "<-"+nn.val+"->";
    if(nn.left != null){
        s = nn.left.val +s;
    }
    else{
        s="."+s;
    }
    if(nn.right !=null){
        s = s+ nn.right.val;
    }
    else{
        s=s+".";
    }
    System.out.println(s);
    Display(nn.left);
    Display(nn.right);
}

public int max(){
    return maximum(root);
}

private int maximum(Node nn){
     if(nn == null){
            return Integer.MIN_VALUE;
        }
        int a = maximum(nn.left);
       int b =  maximum(nn.right);
       return Math.max(nn.val,Math.max(a,b));

}

public boolean find(int item){
        return find(root, item);
    }

    private boolean find(Node node, int item){
        if(node == null) return false;
        if(node.val == item) return true;
        boolean left = find(node.left, item);
        boolean right = find(node.right, item);
        return left || right;
    }
    public int height(Node nn){
        if(nn == null) return -1;
        int left = height(nn.left);
        int right = height(nn.right);
        return Math.max(left, right)+1;
    
}

 public static void main(String[] args) {
        q1_BT_making bt = new q1_BT_making();
   bt.Display();
        
    }


}


    


