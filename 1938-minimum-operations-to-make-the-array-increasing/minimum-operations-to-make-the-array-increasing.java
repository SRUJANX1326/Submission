class Solution {
    public int minOperations(int[] nums) {
        if(nums.length==1) return 0;
        int count=0;
        int increment;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]>=nums[i+1]){
                increment=nums[i]-nums[i+1]+1;
                nums[i+1]+=increment;
                count+=increment;
            }
        }
        return count;
    }
}