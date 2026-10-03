class Solution {
    public int findGCD(int[] nums) {
        int n=Integer.MAX_VALUE;
        int m=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>m) m=nums[i];
            if(nums[i]<n) n=nums[i];
        }
        int r=0;
        while(n!=0){
            r=m%n;
            m=n;
            n=r;
        }
        return m;
    }
}