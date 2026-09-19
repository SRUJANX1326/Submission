class Solution {
    public List<Integer> findDuplicates(int[] nums) {
       HashSet<Integer> temp=new HashSet();
       List<Integer> ans=new ArrayList();
       for(int i=0;i<nums.length;i++){
        if(!temp.contains(nums[i])) temp.add(nums[i]);
        else ans.add(nums[i]);
       } 
       return ans;
    }
}