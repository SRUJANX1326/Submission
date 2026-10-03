class Solution {
    public int sum(String s){
        int ans=0;
        for(int i=0;i<s.length();i++){
            ans+=Character.getNumericValue(s.charAt(i));
        }
        return ans;
    }
    public int product(String s){
        int ans=1;
        for(int i=0;i<s.length();i++){
            ans*=Character.getNumericValue(s.charAt(i));
        }
        return ans;
    }
    public boolean checkDivisibility(int n) {
        return n%(sum(Integer.toString(n))+ product(Integer.toString(n)))==0 ;
    }
}