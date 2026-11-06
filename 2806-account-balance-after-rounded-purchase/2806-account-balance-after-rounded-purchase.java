class Solution {
    public int accountBalanceAfterPurchase(int pA) {
        int r=pA%10;
        if(r>=5){ int sum=10-r; pA+=sum;}
        else pA-=r;
        return 100-pA;
    }
}