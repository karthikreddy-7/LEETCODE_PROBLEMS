class Solution {
    public int[] countBits(int n) {
        int[] arr=new int[n+1];
        for (int i=0;i<arr.length;i++){
            arr[i]=count(i);
        }
        return arr;
    }
    public int count(int i){
        int count=0;
        while (i>0){
            int res=i & 1;
            if (res==1){
                count++;
            }
            i=i>>1;
        }
        return count;
    }
}