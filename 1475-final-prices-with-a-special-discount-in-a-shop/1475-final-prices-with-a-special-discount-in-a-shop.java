class Solution {
    public int[] finalPrices(int[] prices) {
        int[] ans=new int[prices.length];
        int discount=-1;
        int index=0;
        int prev=0;
        for(int i=0;i<prices.length;i++){
            System.out.println(Arrays.toString(ans));
            if(prev<=prices[i]) discount=-1;
            if(discount==prices[i] && i==index) discount=-1;
            if(discount==-1){
                for(int j=i+1;j<prices.length;j++){
                    if(prices[j]<=prices[i]) {discount=prices[j];
                    index=j; break;}
                }
            }
            if(discount==-1) discount=0;
            ans[i]=prices[i]-discount;
            prev=prices[i];
        }
        return ans;
    }
}