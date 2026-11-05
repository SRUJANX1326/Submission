class Solution {
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        int count = 0;
        boolean condition;
        for (int x : arr1) {
            condition = false;
            for (int y : arr2) {
                if (Math.abs(x - y) <= d) {
                    condition = true;
                    break;
                }
            }
            if (!condition)
                count++;
        }
        return count;
    }
}