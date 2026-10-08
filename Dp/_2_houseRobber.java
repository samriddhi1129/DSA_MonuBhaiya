import java.util.*;
public class _2_houseRobber {
    public static void main(String[] args) {
        int[] nums = {1,2,3,1};
        int[] dp = new int[nums.length];
        Arrays.fill(dp,-1); // edge case if all house or element of array have value 0 then 
        System.out.println(recursion(nums,0));
        System.out.println(top_down(nums,0,dp));
        System.out.println(bottom_up(nums));
        
    }
    // method 1 : recursion (left to right loop)

    public static int recursion(int[] nums, int i){
        if(i>= nums.length) return 0;

        int pick=nums[i]+recursion(nums, i+2);
        int notpick = recursion(nums, i+1);
        return Math.max(pick, notpick);

    }
    // method 2: top down approach (Recursive DP approach)         (left to right loop)

     public static int top_down(int[] nums, int i, int[] dp){
        if(i>= nums.length) return 0;
        if(dp[i] !=-1) return dp[i];

        int pick=nums[i]+top_down(nums, i+2,dp);
        int notpick = top_down(nums, i+1,dp);
        return dp[i] = Math.max(pick, notpick);
     }
        // method 3: bottom  up approach (Tabulation method)        (left to right loop) 

        public static int bottom_up(int[] nums){
            if(nums.length == 1) return nums[0];
            int[] dp = new int[nums.length];
            dp[0] = nums[0];
            dp[1] = Math.max(nums[0], nums[1]);
              for(int i =2; i<nums.length; i++){
                dp[i]=Math.max(nums[i]+dp[i-2], dp[i-1]);
                 
              }
              return dp[nums.length-1];

    

        }



       

    }

// doubt 1: what is meaning of loop forward and table backward