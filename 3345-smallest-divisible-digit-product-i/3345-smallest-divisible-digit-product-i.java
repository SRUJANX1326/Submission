class Solution {
    public int productOfDigits(int n){
        int p=1;
        while(n>0){
            int d=n%10;
            p*=d;
            n=n/10;
        }
        return p;
    }
    public int smallestNumber(int n, int t) {
        for(int i=n;i<Integer.MAX_VALUE;i++){
            if(productOfDigits(i)%t==0) return i;
        }
        return -1;
    }
}