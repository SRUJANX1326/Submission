class Solution {
    public int minMoves(int[] nums) {
        Arrays.sort(nums);
        long ans = 0;
        int minVal = nums[0]; 
        for (int i = 0; i < nums.length; i++) {
            ans += (nums[i] - minVal);
        }
        return (int) ans;
    }
}