class Solution {
    public int sumBase(int n, int k) {
        int ans=0;
        String temp=Integer.toString(n,k);
        for(int i=0;i<temp.length();i++){
            ans+=Character.getNumericValue(temp.charAt(i));
        }
        return ans;
    }
}