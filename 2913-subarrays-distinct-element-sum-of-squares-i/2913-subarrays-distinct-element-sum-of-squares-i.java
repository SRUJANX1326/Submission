class Solution {
    public int sumCounts(List<Integer> nums) {
        int sum=0;
        for(int i=1;i<=nums.size();i++){
            for(int j=0;i+j<=nums.size();j++){
                HashSet<Integer> temp=new HashSet(nums.subList(j,i+j));
                sum+=temp.size()*temp.size();
            }
        }
        return sum;
    }
}