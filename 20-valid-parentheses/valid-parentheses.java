import java.util.ArrayList;
import java.util.List;
import java.util.Set;

class Solution {
    public boolean isValid(String s) {
        ArrayList<Character> stack = new ArrayList<>();
        ArrayList<Character> open = new ArrayList<>(List.of('(', '{', '['));
        ArrayList<Character> close = new ArrayList<>(List.of(')', '}', ']'));

        for (char ch : s.toCharArray()) {
            if (open.contains(ch)) {
                stack.addLast(ch);
                continue;
            }
            if (close.contains(ch)) {
                // BUG FIX 1: Prevent crash when a closing bracket appears with no matching open bracket
                if (stack.isEmpty()) return false;

                int index = open.indexOf(stack.getLast());
                if (ch != close.get(index)) return false;
                
                stack.removeLast();
            } 
        }

        // BUG FIX 2: Ensure all opened brackets were properly closed
        return stack.isEmpty();
    }
}