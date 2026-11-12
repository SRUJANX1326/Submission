class Solution {
    public boolean mI(int[] nums){
        boolean condition=false;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]>=nums[i+1]) return false;
        }
        return true;
    }
    public boolean mD(int[] nums){
        boolean condition=false;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]<=nums[i+1]) return false;
        }
        return true;
    }
    public int longestMonotonicSubarray(int[] nums) {
        for(int i=nums.length;i>=1;i--){
            for(int j=0;i+j<=nums.length;j++){
                int[] arr=Arrays.copyOfRange(nums,j,i+j);
                if(mI(arr)||mD(arr)) return i;
            }
        }
        return 1;
    }
}