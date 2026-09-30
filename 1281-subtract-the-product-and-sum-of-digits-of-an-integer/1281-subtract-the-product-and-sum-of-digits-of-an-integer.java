class Solution {
    public int product(String S){
        int ans=1;
        for(int i=0;i<S.length();i++){
            ans*=Character.getNumericValue(S.charAt(i));
        }
        return ans;
    }
    public int sum(String S){
        int sum=0;
        for(int i=0;i<S.length();i++){
            sum+=Character.getNumericValue(S.charAt(i));
        }
        return sum;
    }
    public int subtractProductAndSum(int n) {
        return product(Integer.toString(n))-sum(Integer.toString(n));
    }
}