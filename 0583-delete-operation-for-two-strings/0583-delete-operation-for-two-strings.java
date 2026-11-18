class Solution {
    String one,two;
    int m,n;
    int[][] dp;
    public void dp_table(){
        m=one.length();
        n=two.length();
        dp=new int[m+1][n+1];
        for(int i=1;i<=m;i++){
            for(int j=1;j<=n;j++){
                if(one.charAt(i-1)==two.charAt(j-1)) dp[i][j]=dp[i-1][j-1]+1;
                else dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
            }
        }
    }
    public int minDistance(String word1, String word2) {
        one=word1;
        two=word2;
        dp_table();
        System.out.println(m);
        System.out.println(n);
        System.out.println(dp[m][n]);
        return m+n-2*dp[m][n];
    }
}