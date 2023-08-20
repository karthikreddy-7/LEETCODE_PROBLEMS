import java.util.*;

class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer, Integer> h = new HashMap<>();
        
        // Count the occurrences of each number
        for (int num : arr) {
            h.put(num, h.getOrDefault(num, 0) + 1);
        }
        
        HashSet<Integer> occurrenceSet = new HashSet<>();
        
        // Check if the occurrences are unique
        for (int count : h.values()) {
            if (occurrenceSet.contains(count)) {
                return false; // If not unique, return false
            }
            occurrenceSet.add(count);
        }
        
        return true; // All occurrences are unique
    }
}
