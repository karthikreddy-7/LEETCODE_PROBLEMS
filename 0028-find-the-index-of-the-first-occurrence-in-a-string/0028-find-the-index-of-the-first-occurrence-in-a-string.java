class Solution {
    public int strStr(String haystack, String needle) {
        int l=haystack.length()-needle.length();
        for (int i=0;i<l+1;i++){
            if (haystack.substring(i,i+needle.length()).equals(needle)){
                return i;
            }
        }
        return -1;
    }
}