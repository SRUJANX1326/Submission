class Solution {
    public int[] maxProductPair(int[] nums, int target) {
        int i=-1;
        int j=-1;
        int max_product=Integer.MIN_VALUE;
        for(int m=0;m<nums.length;m++){
            for(int n=0;n<nums.length;n++){
                if(nums[m]+nums[n]==target && nums[m]>nums[n] && m!=n){
                    int product=nums[m]*nums[n];
                    if(max_product<product){
                        max_product=product;
                        i=m;
                        j=n;
                    }
                }
            }
        }
        return new int[]{i,j};
    }
}