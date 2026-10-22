class Solution {
    public boolean Palindrome(String S){
        String rev="";
        for(int i=S.length()-1;i>=0;i--){
            rev+=S.charAt(i);
        }
        return rev.equals(S);
    }
    public boolean isStrictlyPalindromic(int n) {
        for(int i=2;i<=n-2;i++){
            if(!Palindrome(Integer.toString(n,i))){
                return false;
            }
        }
        return true;
    }
}