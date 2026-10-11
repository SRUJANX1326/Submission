class Solution {
    public int minimumCost(int[] cost) {
        int n=cost.length;
        if(n==1) return cost[0];
        if(n==2) return cost[0]+cost[1];
        int ans=0;
        Arrays.sort(cost);
        System.out.println(Arrays.toString(cost));
        for(int i=n-1;i>=1;i=i-3){
            ans+=(cost[i]+cost[i-1]);
        }
        if(n%3==1) ans+=cost[0];
        
        return ans;
    }
}
