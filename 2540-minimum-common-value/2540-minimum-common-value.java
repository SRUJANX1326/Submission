class Solution {
    public int getCommon(int[] nums1, int[] nums2) {
        int i=0;
        int j=0;
        int one=nums1.length;
        int two=nums2.length;
        int store_one;
        int store_two;
        while(i<one && j<two){
            if(nums1[i]==nums2[j]) return nums1[i];
            store_one=nums1[i];
            store_two=nums2[j];
            while(i<one && j<two && (nums1[i]==store_one) && nums1[i]<nums2[j]) i++;
            while(j<two && i<one && (nums2[j]==store_two) && nums1[i]>nums2[j]) j++;
        }
        return -1;
    }
}