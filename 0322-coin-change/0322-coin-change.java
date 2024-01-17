class Solution {
    public int coinChange(int[] coins, int amount) {
        int[] dp=new int[amount+1];
        Arrays.fill(dp,-1);
        dp[0]=0;
        int ans=helper(coins,amount,dp);
        if (ans==Integer.MAX_VALUE){
            return -1;
        }
        else{
            return ans;
        }
    }
    public int helper(int[] coins,int amount,int[] dp){
        if (amount==0){
            return 0;
        }
        int mincoins=Integer.MAX_VALUE;
        for (int i=0;i<coins.length;i++){
            if (coins[i]<=amount){
                int subans=0;
                if (dp[amount-coins[i]]!=-1){
                    subans=dp[amount-coins[i]];
                } else{
                    subans=helper(coins,amount-coins[i],dp);
                }
                if (subans!=Integer.MAX_VALUE && subans+1<mincoins){
                    mincoins=subans+1;
                }
            }
        }
        return dp[amount]=mincoins;
    }
}