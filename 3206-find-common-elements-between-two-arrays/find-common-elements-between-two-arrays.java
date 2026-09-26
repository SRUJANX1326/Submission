class Solution {
    public int[] findIntersectionValues(int[] nums1, int[] nums2) {
        HashSet<Integer> one=new HashSet<>();
        HashSet<Integer> two=new HashSet<>();
        for(int i=0;i<nums1.length;i++){
            one.add(nums1[i]);
        }
        for(int i=0;i<nums2.length;i++){
            two.add(nums2[i]);
        }
        int ans1=0;
        int ans2=0;
        for(Integer X: one){
            if(two.contains(X)){
                ans1 += Arrays.stream(nums1)
              .filter(val -> val == X)
              .count();
            }
        }
        for(Integer X: two){
            if(one.contains(X)){
                ans2 += Arrays.stream(nums2)
              .filter(val -> val == X)
              .count();
            }
        }
        System.out.println(ans1);
        int[] ans={ans1,ans2};
        return ans;
    }
}