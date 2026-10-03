class Solution {
    public int findGCD(int[] nums) {
        //n->min value
        int n=nums[0];
        int m=nums[0];
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

