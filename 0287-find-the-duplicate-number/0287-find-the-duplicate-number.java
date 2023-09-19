class Solution {
    public int findDuplicate(int[] nums) {
        HashMap<Integer,Integer> map= new HashMap<>();
        int res=0;
        for (int i=0;i<nums.length;i++){
            int x=map.getOrDefault(nums[i],0);
            if (x==0){
                map.put(nums[i],x+1);
            }
            else{
                res=nums[i];
            }
        }
        return res;
        
        
    }
}