class Solution {
    public int getMinDistance(int[] nums, int target, int start) {
        int n=nums.length;
        int min_x=n;
        for(int i=0;i<n;i++){
            if(nums[i]==target){
                int x=Math.abs(i-start);
                if(min_x>x) min_x=x;
            }
        }
        return min_x;

    }
}