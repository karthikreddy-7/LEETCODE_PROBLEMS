class Solution {
    public int trap(int[] height) {
        int[] lmax = new int[height.length];
        int[] rmax = new int[height.length];
        int max = Integer.MIN_VALUE;
        for (int i = 0;i < height.length;i++){
            if (max < height[i]){
                max = height[i];
            }
            lmax[i] = max;
        }
        max = Integer.MIN_VALUE;
        for (int i = height.length -1;i >= 0;i--){
            if (max < height[i]){
                max = height[i];
            }
            rmax[i] = max;
        }
        // Finding how many units of rain water is trapped
        int count = 0;
        for (int i = 0;i < height.length;i++){
            count += (Math.min(lmax[i],rmax[i]) - height[i]);
        }
        return count;
    }
}