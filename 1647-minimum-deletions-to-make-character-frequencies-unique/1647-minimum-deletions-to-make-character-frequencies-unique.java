class Solution {
    public int minDeletions(String s) {
        int[] characterCount = new int[26];
        for(char ch : s.toCharArray()) {
            characterCount[ch - 'a']++;
        }
        Set<Integer> set = new HashSet<>();
        int deletionCount = 0;
        for(int count : characterCount) {
            while(set.contains(count) && count > 0) {
                deletionCount++;
                count--;
            }
            set.add(count);
        }
        return deletionCount;
    }
}