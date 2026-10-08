import java.util.*;
public class _3_Minimum_cost_climbing_stairs {
    public static void main(String[] args) {
        int[] cost = {10, 15, 20};
        int f1 = recursion(cost,0);
        int f2 = recursion(cost,1);
        System.out.println(Math.min(f1,f2));

        int[] dp = new int[cost.length];
        Arrays.fill(dp,-1);
          int f3 = TopDown(cost,dp,0);
        int f4 =TopDown(cost,dp,1);
        System.out.println(Math.min(f3,f4));
    }

    // MEthod 1 : recursion 
    public static int recursion(int[] cost, int i){
        if(i>=cost.length) return 0;
        
        int f = recursion(cost, i+1);
        int s =  recursion(cost, i+2);
        return Math.min(f,s)+cost[i];
    }
    
    // MEthod 2: Top down approach
       public static int TopDown(int[] cost, int[]dp, int i){
        if(i>=cost.length) return 0;
        if(dp[i]!=-1)return dp[i];
        
        int f = TopDown(cost, dp,i+1);
        int s =  TopDown(cost,dp, i+2);
        return dp[i] = Math.min(f,s)+cost[i];
    }


    // Method 3: Bottom up approach (Tabulation)
    // public static int bottomup(int[] cost){
    //     int[] dp = new int[cost.length];

    // }


}
