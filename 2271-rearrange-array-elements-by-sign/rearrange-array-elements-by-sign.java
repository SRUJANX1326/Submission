class Solution {
    public int[] rearrangeArray(int[] nums) {
        ArrayList<Integer> positive=new ArrayList();
        ArrayList<Integer> negetive=new ArrayList();
        for(int x: nums){
            if(x>0){
                positive.add(x);
            }else{
                negetive.add(x);
            }
        }
        int m=0;
        int n=0;
        for(int i=0;i<nums.length;i++){
            if(i%2==0){
                nums[i]=positive.get(m);
                m++;
            }else{
                nums[i]=negetive.get(n);
                n++;
            }
        }
        return nums;
    }
}