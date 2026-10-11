class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        ArrayList<Integer> left=new ArrayList();
        ArrayList<Integer> right=new ArrayList();
        int pivot_count=0;
        int n=nums.length;
        for(int i=0;i<n;i++){
            if(nums[i]<pivot){
                left.add(nums[i]);
            }else if(nums[i]>pivot){
                right.add(nums[i]);
            }else{
                pivot_count++;
            }
        }
        int[] ans=new int[n];
        int j=0;
        for(int i=0;i<left.size();i++){
            ans[j++]=left.get(i);
        }
        while(pivot_count!=0){
            ans[j++]=pivot;
            pivot_count--;
        }
        for(int i=0;i<right.size();i++){
            ans[j++]=right.get(i);
        }
        return ans;
    }
}