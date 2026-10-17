class Solution {
    public int missingInteger(int[] nums) {
        int sum = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1] + 1) {
                break;
            }
            sum += nums[i];
        }
        ArrayList<Integer> AL = new ArrayList<>();
        for (int num : nums) {
            AL.add(num);
        }
        for (int i = sum; i < Integer.MAX_VALUE; i++) {
            if (!AL.contains(i))
                return i;
        }
        return -1;
    }
}