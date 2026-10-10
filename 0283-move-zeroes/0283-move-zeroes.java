class Solution {
    public void moveZeroes(int[] nums) {
        int z=0;
        int n=0;
        int len=nums.length;
        while(z<len && n<len){
            if(nums[z]==0){
            nums[z]=nums[n];
            nums[n]=0;
            }
            while(z<len && nums[z]!=0) z++;
            n=z+1;
            while(n<len && nums[n]==0) n++;
        }
    }
}