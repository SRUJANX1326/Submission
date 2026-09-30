class Solution {
    int count=0;
    public void yesOrNo(String S){
        if(S.length()%2==0) count++;
    }
    public int findNumbers(int[] nums) {
        for(int i=0;i<nums.length;i++){
            yesOrNo(Integer.toString(nums[i]));
        }
        return count;
    }
}