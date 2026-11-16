class Solution {
    public int sumOfUnique(int[] nums) {
        HashSet<Integer> dup=new HashSet();
        HashSet<Integer> uni=new HashSet();
        int sum=0;
        for(int x: nums){
            if(!dup.contains(x) && !uni.contains(x)) {uni.add(x); sum+=x;}
            else if(!dup.contains(x) && uni.contains(x)){
                uni.remove(x);
                dup.add(x);
                sum-=x;
            }
        }
        return sum;
    }
}