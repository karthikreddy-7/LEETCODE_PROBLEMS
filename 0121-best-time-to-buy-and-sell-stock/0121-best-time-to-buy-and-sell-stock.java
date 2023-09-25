class Solution {
    public int maxProfit(int[] prices) {
        int maxprofit=0;
        int minimumsofar=prices[0];
        for (int i=0;i<prices.length;i++){
            minimumsofar=Math.min(minimumsofar,prices[i]);
            maxprofit=Math.max(maxprofit,(prices[i]-minimumsofar));
        }
        return maxprofit;
        
    }
}