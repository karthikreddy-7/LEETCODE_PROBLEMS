class Solution {
    public int maxProduct(int[] nums) {
        int maxi=0;
        for (int i=0;i< nums.length;i++){
            for (int j=0;j<nums.length;j++){
                if (i!=j){
                    int prod=(nums[i]-1)*(nums[j]-1);
                    if (prod>maxi){
                        maxi=prod;
                    }
                }
            }
        }
        return maxi;
    }
}