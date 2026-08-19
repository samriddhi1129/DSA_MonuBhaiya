package lecture2;

public class q3_searching {
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
    
}
