class Solution {
    int area=0;
    public void Area(int[][] grid , int i,int j, int m,int n){
        if(i<0||j<0||i>=m||j>=n||grid[i][j]==0) return;
        area++;
        grid[i][j]=0;
        Area(grid,i+1,j,m,n);
        Area(grid,i,j+1,m,n);
        Area(grid,i-1,j,m,n);
        Area(grid,i,j-1,m,n);
    }
    public int maxAreaOfIsland(int[][] grid) {
        int max_area=0;
        int m=grid.length;
        int n=grid[0].length;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]==1){
                    area=0;
                    Area(grid,i,j,m,n);
                    if(area>max_area) max_area=area;
                }
            }
        }
        return max_area;
    }
}