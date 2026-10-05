class Solution {
    public boolean checkValidString(String s) {
        ArrayList<Integer> bracket = new ArrayList<>();
        ArrayList<Integer> star = new ArrayList<>();

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                bracket.addLast(i);
            } else if (s.charAt(i) == '*') {
                star.addLast(i);
            } else {
                if (!bracket.isEmpty()) {
                    bracket.removeLast();
                } else if (!star.isEmpty()) {
                    star.removeLast();
                } else {
                    return false;
                }
            }
        }

        while (!bracket.isEmpty() && !star.isEmpty()) {
            int bracketIndex = bracket.removeLast();
            int starIndex = star.removeLast();

            if (bracketIndex > starIndex) {
                return false;
            }
        }

        return bracket.isEmpty();
    }
}