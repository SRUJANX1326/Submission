class Solution {
    public long sumAndMultiply(int n) {
        long x=0;
        long m=1;
        int ans=0;
        while(n>0){
            int d=n%10;
            ans+=d;
            if(d!=0){
                x+=m*d;
                m=m*10;
            }
            n=n/10;
        }
        return x*ans;
    }
}