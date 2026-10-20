class Solution {
    public int minSteps(String s, String t) {
        int[] freq = new int[26];
        for (char x : t.toCharArray()) freq[x - 'a']++;

        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            int idx = s.charAt(i) - 'a';
            if (freq[idx] > 0) {
                freq[idx]--;   // matched, "remove" from t
            } else {
                count++;       // unmatched, needs a change
            }
        }
        return count;
    }
}