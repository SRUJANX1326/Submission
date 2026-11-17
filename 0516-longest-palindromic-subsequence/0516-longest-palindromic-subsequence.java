class Solution {
    String one;
    String two;
    int[][] dp;
    int m;
    int n;
    ArrayList<String> AL=new ArrayList();
    public void dp_table(){
        m=one.length();
        n=two.length();
        dp= new int[m+1][n+1];
        for(int i=1;i<=m;i++){
            for(int j=1;j<=n;j++){
                if(one.charAt(i-1)==two.charAt(j-1)) dp[i][j]=dp[i-1][j-1]+1;
                else dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
            }
        }
    }
    public void LCS_String(int i,int j,String ans){
        if(i==0 || j==0){
            AL.add(new StringBuilder(ans).reverse().toString());
            return;
        }
        if(one.charAt(i-1)==two.charAt(j-1)){
            LCS_String(i-1,j-1,ans+one.charAt(i-1));
        }else{
            if(dp[i-1][j]==dp[i][j]) LCS_String(i-1,j,ans);
            else if(dp[i][j-1]==dp[i][j]) LCS_String(i,j-1,ans);
        }
    }
    public int longestPalindromeSubseq(String s) {
        one=s;
        two=new StringBuilder(s).reverse().toString();
        dp_table();
        LCS_String(m,n,"");
        return AL.get(0).length();
    }
}