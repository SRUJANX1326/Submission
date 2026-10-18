class Solution {
    public int[] findErrorNums(int[] nums) {
        int missing=0;
        int duplicate=0;;
        HashSet<Integer> HS=new HashSet();
        for(int i=0;i<nums.length;i++){
            if(!HS.contains(nums[i])) HS.add(nums[i]);
            else duplicate=nums[i];
        }
        for(int i=1;i<=nums.length;i++){
            if(!HS.contains(i)){
                missing=i;
                continue;
            }
        }
        return new int[]{duplicate,missing};
    }
}