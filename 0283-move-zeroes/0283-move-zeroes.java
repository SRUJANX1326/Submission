class Solution {
    public void moveZeroes(int[] nums) {
        int z=0;
        int n=0;
        int len=nums.length;
        while(z<len && n<len){
            while(z<len && nums[z]!=0) z++;
            n=z+1;
            while(n<len && nums[n]==0) n++;
            if(n>=len) break;
            nums[z]=nums[n];
            nums[n]=0;
        }
        return;
    }
}