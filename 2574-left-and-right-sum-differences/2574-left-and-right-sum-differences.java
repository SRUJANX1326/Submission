class Solution {
    public int[] leftRightDifference(int[] nums) {
        int n=nums.length;
        int[] nums_rev=new int[n];
        int j=0;
        for(int i=0;i<n;i++){
            nums_rev[i]=nums[i];
        }
        for(int i=1;i<n;i++){
            nums[i]+=nums[i-1];
        }
        for(int i=n-2;i>=0;i--){
            nums_rev[i]+=nums_rev[i+1];
        }
        int[] ans=new int[n];
        for(int i=0;i<n;i++){
            ans[i]=Math.abs(nums[i]-nums_rev[i]);
        }
        return ans;
    }
}