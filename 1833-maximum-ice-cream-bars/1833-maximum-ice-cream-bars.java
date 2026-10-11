class Solution {
    public int maxIceCream(int[] costs, int coins) {
        Arrays.sort(costs);
        int ans = 0;
        int count = 0;
        for (int i = 0; i < costs.length; i++) {
            if (ans + costs[i] <= coins) {
                ans += costs[i];
                count++;
            } else
                break;
        }
        return count;
    }
}