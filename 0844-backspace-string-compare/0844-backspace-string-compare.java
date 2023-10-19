class Solution {
    public boolean backspaceCompare(String s, String t) {
        String s1 = "";
        String t1 = "";

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '#') {
                if (!s1.isEmpty()) {
                    s1 = s1.substring(0, s1.length() - 1);
                }
            } else {
                s1 = s1 + s.charAt(i);
            }
        }

        for (int i = 0; i < t.length(); i++) {
            if (t.charAt(i) == '#') {
                if (!t1.isEmpty()) {
                    t1 = t1.substring(0, t1.length() - 1);
                }
            } else {
                t1 = t1 + t.charAt(i);
            }
        }

        return s1.equals(t1);
    }
}
