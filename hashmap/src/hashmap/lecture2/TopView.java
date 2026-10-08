package hashmap.lecture2;

import java.util.List;

public class TopView {
    public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode() {
		}

		TreeNode(int val) {
			this.val = val;
		}

		TreeNode(int val, TreeNode left, TreeNode right) {
			this.val = val;
			this.left = left;
			this.right = right;
		}
	}

	class Solution {
		public List<Integer> TopView(TreeNode root) {
            Queue<Pair> q = new LinkedList<>();
            TreeMap<Integer, Integer> map = new TreeMap<>();
            q.add(new Pair(root,0));
            while(!q.iEmpty()){
                
            }

		}
	}
    
}
