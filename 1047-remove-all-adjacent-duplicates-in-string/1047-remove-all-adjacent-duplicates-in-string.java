class Solution {
    public String removeDuplicates(String s) {
        String temp = Character.toString(s.charAt(0));
        for (int i = 1; i < s.length(); i++) {
            if (temp.length() == 0) {
                temp += Character.toString(s.charAt(i));
                continue;
            }
            if (s.charAt(i) != temp.charAt(temp.length() - 1)) {
                temp += Character.toString(s.charAt(i));
            } else {
                temp = temp.substring(0, temp.length() - 1);
            }
        }
        return temp;
    }
}