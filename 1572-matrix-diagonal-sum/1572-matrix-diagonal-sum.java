class Solution {
    public int diagonalSum(int[][] mat) {
        int m=mat.length;
        int n=mat[0].length;
        int i=0;
        int j=0;
        int sum=0;
        while(i<m && j<n){
            sum+=mat[i][j];
            i++;
            j++;
        }
        i=0;
        j=mat[0].length-1;
        while(i<m && j>=0){
            if(i==j){
                i++;
             j--;
             continue;
             
            }
            sum+=mat[i][j];
            i++;
            j--;
        }
        return sum;
    }
}