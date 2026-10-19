class Solution {
    public int distinctAverages(int[] nums) {
        HashSet<Double> HS=new HashSet();
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            HS.add((nums[i]+nums[nums.length-i-1])/2.0);
        }
        return HS.size();
    }
}