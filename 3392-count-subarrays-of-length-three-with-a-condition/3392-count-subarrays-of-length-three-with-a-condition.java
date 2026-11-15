class Solution {
    public int countSubarrays(int[] nums) {
        int count=0;
        ArrayList<Integer> AL;
        for(int i=0;i+3<=nums.length;i++){
            AL=new ArrayList();
            if((double)nums[i]+nums[i+2]==(double)nums[i+1]/2){
                count++; 
                System.out.println(nums[i]+nums[i+2]);
                System.out.println(nums[i+1]/2);}
            }
        return count;
    }
}