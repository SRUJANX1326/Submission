class Solution {
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int ans=0;
        int n=nums.length-1;
        if(nums[n]*nums[n-1]*nums[n-2]>nums[0]*nums[1]*nums[n]) ans=nums[n]*nums[n-1]*nums[n-2];
        else ans=nums[0]*nums[1]*nums[n];
        return ans;
    }
}