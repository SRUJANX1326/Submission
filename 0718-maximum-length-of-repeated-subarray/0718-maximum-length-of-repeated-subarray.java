class Solution {
    int[][] dp;
    int[] one;
    int[] two;
    int m,n, max=0;
    public void dp_table(){
        m=one.length;
        n=two.length;
        dp=new int[m+1][n+1];
        for(int i=1;i<=m;i++){
            for(int j=1;j<=n;j++){
                if(one[i-1]==two[j-1]) dp[i][j]=dp[i-1][j-1]+1;
                if(dp[i][j]>max) max=dp[i][j];
            }
        }

    }
    public int findLength(int[] nums1, int[] nums2) {
        one=nums1;
        two=nums2;
        dp_table();
        return max;
    }
}
 