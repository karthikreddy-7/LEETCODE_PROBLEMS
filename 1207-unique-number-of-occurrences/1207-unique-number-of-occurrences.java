class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer, Integer> frequencyMap = new HashMap<>();

        // Count the frequency of each element
        for (int i : arr) {
            frequencyMap.put(i, frequencyMap.getOrDefault(i, 0) + 1);
        }

        // Check for repeated values in the frequencies
        HashSet<Integer> seenFrequencies = new HashSet<>();
        for (int frequency : frequencyMap.values()) {
            if (!seenFrequencies.add(frequency)) {
                return false;  // Repeated frequency found
            }
        }

        return true;  // All frequencies are unique
    }
}