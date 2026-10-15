class Solution {
    public int[][] divideArray(int[] nums, int k) {
        Arrays.sort(nums);
        int col=3;
        int row=nums.length/3;
        int[][] ans=new int[row][col];
        int idx=0;
        for(int i=0;i<row;i++){
            int temp=nums[idx];
            for(int j=0;j<col;j++){
                if(nums[idx]-temp<=k) {ans[i][j]=nums[idx]; idx++;}
                else return new int[][]{};
            }
        }
        return ans;
    }
}