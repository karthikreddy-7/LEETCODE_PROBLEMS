class Solution {
    public String reverseWords(String s) {
        String[] words = s.split(" "); // Split the input string into words
        StringBuilder result = new StringBuilder();
        
        for (String word : words) {
            StringBuilder reversedWord = new StringBuilder(word);
            result.append(reversedWord.reverse()).append(" "); 
        }
        
        return result.toString().trim(); 
        
    }
}