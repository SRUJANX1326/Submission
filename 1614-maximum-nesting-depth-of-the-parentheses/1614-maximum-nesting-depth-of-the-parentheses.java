class Solution {
    public int maxDepth(String s) {
        ArrayList<Character> AL = new ArrayList();
        int temp = 0;
        int max_depth = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                AL.add('(');
                temp++;
                if(max_depth<temp) max_depth=temp;
            } else if (s.charAt(i) == ')') {
                AL.remove(Character.valueOf(')'));
                temp--;
            }
        }
        return max_depth;
    }
}