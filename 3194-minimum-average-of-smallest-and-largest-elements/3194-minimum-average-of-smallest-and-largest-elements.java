class Solution {
    public double minimumAverage(int[] nums) {
        double averages=Double.MAX_VALUE;
        Arrays.sort(nums);
        int i=0;
        int j=nums.length-1;
        while(i<j){
            double temp=(nums[i]+nums[j])/2.0;
            if(temp<averages) averages=temp;
            i++;
            j--;
        }
        return averages;
    }
}