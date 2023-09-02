import java.util.Stack;

class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char cur = s.charAt(i);
            if (isopening(cur)) {
                st.push(cur);
            } else {
                if (st.isEmpty()) {
                    return false;
                } else if (!ismatching(st.pop(), cur)) {
                    return false;
                }
            }
        }
        return st.isEmpty();
    }

    boolean isopening(char cur) {
        return cur == '(' || cur == '{' || cur == '[';
    }

    boolean ismatching(char a, char b) {
        return (a == '(' && b == ')') ||
               (a == '{' && b == '}') ||
               (a == '[' && b == ']');
    }
}
