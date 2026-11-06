class Solution {
    public int maxProductDifference(int[] nums) {
        int[] max_num={Integer.MIN_VALUE,Integer.MIN_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE};
        for(int i=0;i<nums.length;i++){
            if(nums[i]>=max_num[0]){
                max_num[1]=max_num[0];
                max_num[0]=nums[i];
            }else if(nums[i]>=max_num[1]){
                max_num[1]=nums[i];
            }
            if(nums[i]<=max_num[2]){
                max_num[3]=max_num[2];
                max_num[2]=nums[i];
            }else if(nums[i]<=max_num[3]){
                max_num[3]=nums[i];
            }
        }
        System.out.println(Arrays.toString(max_num));
        return max_num[0]*max_num[1]-max_num[2]*max_num[3];
    }
}