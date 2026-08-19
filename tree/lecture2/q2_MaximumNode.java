package lecture2;

import org.w3c.dom.Node;

public class q2_MaximumNode {
    public static void main(String[] args) {
        q2_MaximumNode bt = new q2_MaximumNode();
        bt.max(null);
        
    }
    public int max(Node nn){
        if(nn == null){
            return Integer.MIN_VALUE;
        }
        int a = max(nn.left);
       int b =  max(nn.right);
       return Math.max(nn.val,Math.max(a,b));
    }
    
}
