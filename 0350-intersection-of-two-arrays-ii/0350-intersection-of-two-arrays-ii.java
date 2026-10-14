class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        ArrayList<Integer> one =new ArrayList();
        ArrayList<Integer> two=new ArrayList();
        for(int i=0;i<nums1.length;i++){
            one.add(nums1[i]);
        }
        for(int j=0;j<nums2.length;j++){
            two.add(nums2[j]);
        }
        ArrayList<Integer> ans=new  ArrayList();
        for(int i=0;i<one.size();i++){
            if(two.contains(one.get(i))){
                ans.add(one.get(i));
                two.remove(Integer.valueOf(one.get(i)));
            }
        }
        int[] final_ans=new int[ans.size()];
        for(int i=0;i<ans.size();i++){
            final_ans[i]=ans.get(i);
        }
        return final_ans;
    }
}