class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder ans=new StringBuilder();
        int i,j;
        int one=word1.length();
        int two=word2.length();
        for(i=0;i<one && i<two;i++){
            ans.append(""+word1.charAt(i)+word2.charAt(i));
        }
        while(i<one){
            ans.append(""+word1.charAt(i));
            i++;
        }
        while(i<two){
            ans.append(""+word2.charAt(i));
            i++;
        }
        return ans.toString();
        
    }
}