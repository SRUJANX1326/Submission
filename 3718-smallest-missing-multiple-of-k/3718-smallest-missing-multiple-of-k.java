class Solution {
    public int missingMultiple(int[] nums, int k) {
        HashSet<Integer> HS=new HashSet();
        for(int n:nums) HS.add(n);
        for(int i=k;i<Integer.MAX_VALUE;i+=k){
            if(!HS.contains(i)){
                return i;
            }
        }
        return -1;
    }
}