class Solution {

    public int sumOfDigits(String s) {
        int sum = 0;

        for (int i = 0; i < s.length(); i++) {
            sum += s.charAt(i) - '0';
        }

        return sum;
    }

    public int smallestIndex(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (i == sumOfDigits(Integer.toString(nums[i]))) {
                return i;
            }
        }
        return -1;
    }
}