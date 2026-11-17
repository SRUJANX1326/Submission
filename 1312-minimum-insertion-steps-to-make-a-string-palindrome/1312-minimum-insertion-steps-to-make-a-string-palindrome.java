class Solution {
    int m,n;
    String one,two;
    int[][] dp;
    public void dp_table(){
        dp=new int[m+1][n+1];
        for(int i=1;i<=m;i++){
            for(int j=1;j<=n;j++){
                if(one.charAt(i-1)==two.charAt(j-1)) dp[i][j]=dp[i-1][j-1]+1;
                else dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
            }
        }
    }
    public int minInsertions(String s) {
        one=s;
        two=new StringBuilder(s).reverse().toString();
        m=one.length();
        n=two.length();
        dp_table();
        if(dp[m][n]==m){
            return 0;
        }else{
            return m-dp[m][n];
        }
    }
}