class Solution {
    ArrayList<HashSet> AL = new ArrayList();
    public void makeHS(String s) {
        HashSet<Character> temp = new HashSet();
        for (int i = 0; i < s.length(); i++) {
            temp.add(s.charAt(i));
        }
        AL.add(temp);
    }
    public int maxProduct(String[] words) {
        for (int i = 0; i < words.length; i++) {
            makeHS(words[i]);
        }
        int max_len = 0;
        for (int i = 0; i < AL.size(); i++) {
            for (int j = i + 1; j < AL.size(); j++) {
                HashSet<Character> one = AL.get(i);
                HashSet<Character> two = AL.get(j);
                HashSet<Character> temp = new HashSet(one);
                temp.retainAll(two);
                if (temp.isEmpty()) {
                    int len = words[i].length() * words[j].length();

                    if (max_len < len) {
                        max_len = len;
                    }
                } else {
                    continue;
                }
            }
        }
        return max_len;
    }
}
