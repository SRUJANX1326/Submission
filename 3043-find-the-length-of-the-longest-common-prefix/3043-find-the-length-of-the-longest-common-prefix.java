class Solution {
    public int LCP(String one, String two) {
        int i = 0;
        int j = 0;
        int ans = 0;
        while (i < one.length() && j < two.length()) {
            if (one.charAt(i) == two.charAt(j)) {
                ans++;
            } else {
                return ans;
            }
            i++;
            j++;
        }
        return ans;
    }

    public int longestCommonPrefix(int[] arr1, int[] arr2) {
        java.util.HashSet<String> set = new java.util.HashSet<>();
        
        for (int i = 0; i < arr1.length; i++) {
            String prefix = Integer.toString(arr1[i]);
            String current = "";
            for (int k = 0; k < prefix.length(); k++) {
                current += prefix.charAt(k);
                set.add(current);
            }
        }
        
        int max_len = 0;
        
        for (int j = 0; j < arr2.length; j++) {
            String word = Integer.toString(arr2[j]);
            String current = "";
            for (int k = 0; k < word.length(); k++) {
                current += word.charAt(k);
                if (set.contains(current)) {
                    max_len = Math.max(max_len, current.length());
                }
            }
        }
        
        return max_len;
    }
}