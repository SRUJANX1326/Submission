class Solution {
    public int search(int[] nums, int target) {
        if(nums[0]==target) return 0;
        int n=nums.length;
        if(nums[0]<nums[n-1]){
            for(int i=n-1;i>=0;i--) if(nums[i]==target) return i;
        }else{
            for(int i=0;i<n;i++) if(nums[i]==target) return i;
        }
        return -1;
    }
}