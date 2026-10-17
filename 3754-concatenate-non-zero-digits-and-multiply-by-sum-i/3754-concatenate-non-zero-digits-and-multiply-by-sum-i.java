class Solution {
    public long findX(int n){
        long x=0;
        long m=1;
        while(n>0){
            int d=n%10;
            if(d!=0){
                x+=m*d;
                m=m*10;
            }
            n=n/10;
        }
        return x;
    }
    public long sum(int n){
        long ans=0;
        while(n>0){
            int d=n%10;
            ans+=d;
            n=n/10;
        }
        return ans;
    }
    public long sumAndMultiply(int n) {
        return findX(n)*sum(n);
    }
}