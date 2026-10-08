package hashmap;

import java.util.HashSet;

public class _3_LongestConsequence_sequence {

	public static void main(String[] args) {
		int[] nums = {0,3,7,2,5,8,4,6,0,1};
	}
		public static int Longest_Consecutive(int[] nums) {
			HashSet<Integer>set = new HashSet<>();
			for(int i =0; i<nums.length; i++) {
				set.add(nums[i]);
			}
			int ans =0;
			for(int i =0; i<nums.length; i++) {
				int x = nums[i];
				if(set.contains(x) && !set.contains(x-1)) {
					
				}
			}
		}
		// TODO Auto-generated method stub

	}

}
