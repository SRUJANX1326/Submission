class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max=0;
        int mayBeMax=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1) {
                mayBeMax++;
            }
            else {
                if(mayBeMax>max) max=mayBeMax;
                mayBeMax=0;
            }
        }
        if(mayBeMax>max) max=mayBeMax;
        return max;
    }
}