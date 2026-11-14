class Solution {
    public int maxPower(String s) {
        int max_freq = 1;
        char prev = s.charAt(0);
        int curr_freq = 1;
        for (int i = 1; i < s.length(); i++) {
            if (prev == s.charAt(i)) {
                curr_freq++;

                if (max_freq < curr_freq) {
                    max_freq = curr_freq;
                }
            } else {
                curr_freq = 1;
            }
            prev = s.charAt(i);
        }
        return max_freq;
    }
}