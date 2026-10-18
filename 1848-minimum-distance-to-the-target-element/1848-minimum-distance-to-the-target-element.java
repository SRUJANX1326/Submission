class Solution {
    public int getMinDistance(int[] nums, int target, int start) {
        int min = Integer.MAX_VALUE;
        for(int i=start;i<nums.length;i++){
            if(nums[i] == target){
                min = Math.abs(i-start);
                break;
            }
        }
        for(int i=start;i>=0;i--){
            if(nums[i] == target){
                min = Math.min(min,Math.abs(i-start));
                break;
            }
        }
        return min;
    }
}