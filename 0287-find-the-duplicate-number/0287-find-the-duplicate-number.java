class Solution {
    public int findDuplicate(int[] nums) {
        HashSet<Integer> HS=new HashSet();
        for(int x:nums){
            if(!HS.contains(x)) HS.add(x);
            else return x;
        }
        return -1;
    }
}