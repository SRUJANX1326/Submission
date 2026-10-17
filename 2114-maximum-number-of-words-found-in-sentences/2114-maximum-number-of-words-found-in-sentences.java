class Solution {
    public int mostWordsFound(String[] sentences) {
        int max_words=0;
        for(String s: sentences){
            int count=0;
            for(int i=0;i<s.length();i++){
                if(s.charAt(i)==' ') count++;
            }
            if(count>max_words) max_words=count;
        }
        return max_words+1;
    }
}