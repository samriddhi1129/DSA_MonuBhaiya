public class BinaryTreeImplementation_Client {
    public static void main(String[] args) {
        // 10 true 20 true 40 false false false true 30 false true 50 false false
        BinaryTreeImplementation bt = new BinaryTreeImplementation(); // creating binary tree
        // displaying bt
        bt.Display();

        // searching
        System.out.println(bt.find(100));

        //maximum elemement
      System.out.println(bt.max());

      // maximum height of tree
      System.out.println(bt.ht());
       System.out.println(bt.ht2());
// 10 true 20 true 50 false false false true 30 true 60 true 80 false false false true 70 false false
       bt.inorder();  //50 20 10 80 60 30 70 
    //    bt.levelOrder();
        // bt.postorder();
        // bt.preorder();

      
      
    }
    
}
