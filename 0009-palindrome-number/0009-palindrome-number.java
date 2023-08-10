class Solution {
    public boolean isPalindrome(int x) {
        int res=0;
        int y=x;
        while (x>0){
            int z=x%10;
            res=res*10 + z;
            x=x/10;
        }
        if (res==y){
            return true;
        }
        else{
            return false;
        }
    }
}