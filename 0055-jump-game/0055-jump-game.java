class Solution {
    public boolean canJump(int[] nums) {
        int max_jump=0;
        for(int i=0;i<nums.length;i++){             
            if(max_jump<0) return false;
            else{
                max_jump=Math.max(max_jump,nums[i])-1;
            }
        }
        return true;
    }
}