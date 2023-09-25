class Solution {
    public int maxArea(int[] height) {
        int left=0;
        int right=height.length-1;
        int Maxarea=0;
        while (left<right){
            int minht=Math.min(height[left],height[right]);
            int area=area(minht,left,right);
            Maxarea=Math.max(Maxarea,area);
            if (height[left]<height[right]) left++;
            else right--;
        }
        return Maxarea;
        
    }
    
    int area(int ht,int left,int right){
        return (ht*(right-left));
    }
}