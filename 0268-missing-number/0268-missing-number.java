class Solution {
    public int missingNumber(int[] nums) {
        int[] arr=new int[nums.length+1];
        for (int i=0;i<arr.length;i++){
            arr[i]=i;
        }
        int xor = 0;
        for (int i = 0; i <= nums.length; i++) {
            xor ^= i;
            if (i < nums.length) {
                xor ^= nums[i];
            }
        }
        return xor;
    }
}