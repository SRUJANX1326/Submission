class Solution {
    public int singleNumber(int[] nums) {
        HashSet<Integer> HS=new HashSet();
        for(int i=0;i<nums.length;i++){
            if(!(HS.contains(nums[i]))){
                HS.add(nums[i]);
                continue;
            }
            if(HS.contains(nums[i])){
                HS.remove(nums[i]);
                continue;
            }
        }
        for(int x: HS){
            return x;
        }
        return 1;
    }
}