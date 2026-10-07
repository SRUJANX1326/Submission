class Solution {
    public String mergeAlternately(String word1, String word2) {
        String ans="";
        int i,j;
        int one=word1.length();
        int two=word2.length();
        for(i=0,j=0;i<one && j<two;i++,j++){
            ans+=""+word1.charAt(i)+word2.charAt(j);
        }
        while(i<one){
            ans+=""+word1.charAt(i);
            i++;
        }
        while(j<two){
            ans+=""+word2.charAt(j);
            j++;
        }
        return ans;
        
    }
}