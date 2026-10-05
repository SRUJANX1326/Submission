import java.util.ArrayDeque;
import java.util.Deque;

class Solution {
    public boolean checkValidString(String s) {
        Deque<Integer> bracket = new ArrayDeque<>();
        Deque<Integer> star = new ArrayDeque<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(') {
                bracket.push(i);
            } else if (c == '*') {
                star.push(i);
            } else { // c == ')'
                if (!bracket.isEmpty()) {
                    bracket.pop();
                } else if (!star.isEmpty()) {
                    star.pop();
                } else {
                    return false;
                }
            }
        }

        // Match remaining '(' with '*' that appear after them
        while (!bracket.isEmpty() && !star.isEmpty()) {
            if (bracket.pop() > star.pop()) {
                return false; // '(' appears after '*', cannot be closed
            }
        }

        return bracket.isEmpty();
    }
}