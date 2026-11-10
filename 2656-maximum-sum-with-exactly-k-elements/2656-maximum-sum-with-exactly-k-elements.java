class Solution {
    public int maximizeSum(int[] nums, int k) {
        Arrays.sort(nums);
        int num=nums[nums.length-1];
        int ans=num;
        for(int i=1;i<k;i++) {num++; ans+=num;}
        return ans;
    }
}