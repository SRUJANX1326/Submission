class Solution {
    public String removeStars(String s) {
        int count=0;
        String ans="";
        for(int i=s.length()-1;i>=0;i--){
            if(s.charAt(i)=='*') count++;
            else if(count>0) count--;
            else ans=Character.toString(s.charAt(i))+ans;
        }
        return ans;
    }
}