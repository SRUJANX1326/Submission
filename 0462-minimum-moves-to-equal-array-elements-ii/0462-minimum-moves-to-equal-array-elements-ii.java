class Solution {
    public int minMoves2(int[] nums) {
        Arrays.sort(nums);
        int ans=0;
        int n=nums.length;
        int mid=nums.length/2;
        for(int i=0;i<n;i++){
            if(i!=mid) ans+=Math.abs(nums[i]-nums[mid]);
        }
        return ans;
    }
}