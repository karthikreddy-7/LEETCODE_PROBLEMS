class Solution {
    public int maxSubArray(int[] nums) {
        int max=nums[0];
        int cur=0;
        //kadane's algorithm:
        for (int i=0;i<nums.length;i++){
            cur=cur+nums[i];
            if (cur>max){
                max=cur;
            }
            if (cur<0){
                cur=0;
            }
        }
        return max;
        
    }
}