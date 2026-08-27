public class ques3_validBST {
    public static void main(String[] args) {

    }

        class bstPair{
            boolean isbst = true;
            long min = Long.MAX_VALUE;
            long max = Long.MIN_VALUE;
        }
        public boolean isValidBST(TreeNode root) {
            return valid(root).isbst;

        }
        public bstPair valid(TreeNode root){
            if(root == null){
                return new bstPair();
            }
            bstPair left = valid(root.left);
            bstPair right = valid(root.right);
            bstPair self = new bstPair();
            self.min= Math.min(root.val,Math.min(left.min, right.min));
            self.max = Math.max(root.val, Math.max(left.max, right.max));
            self.isbst = left.isbst && right.isbst && root.val > left.max && root.val < right.min;
            return self;

        }
    }

