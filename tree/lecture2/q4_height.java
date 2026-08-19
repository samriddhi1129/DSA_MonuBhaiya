package lecture2;

public class q4_height {
    public int height(Node nn){
        if(nn == null) return 0;
        int left = height(nn.left);
        int right = height(nn.right);
        return Math.max(left, right)+1;
    
}
