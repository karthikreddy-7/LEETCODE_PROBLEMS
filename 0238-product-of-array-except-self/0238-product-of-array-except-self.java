class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n=nums.length;
        int[] res=new int[n];
        int[] prefix=new int[n];
        int[] postfix=new int[n];
        int prod=1;
        for (int i=0;i<n;i++){
            prod*=nums[i];
            prefix[i]=prod;
        }
        int prod1=1;
        for (int i=n-1;i>=0;i--){
            prod1*=nums[i];
            postfix[i]=prod1;
        }
        for (int i=0;i<n;i++){
            int preprod=1;
            if (i==0){
                preprod=1;
            }
            else{
                preprod=prefix[i-1];
            }
            int postprod=1;
            if (i==n-1){
                postprod=1;
            }
            else{
                postprod=postfix[i+1];
            }
            res[i]=preprod*postprod;
        }
        return res;
    }
}