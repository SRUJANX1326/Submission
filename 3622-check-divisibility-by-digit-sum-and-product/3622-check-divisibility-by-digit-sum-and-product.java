class Solution {
    public boolean checkDivisibility(int n) {
        int number=n;
        int sum=0;
        int product=1;
        while(n>0){
            int r=n%10;
            sum+=r;
            product*=r;
            n/=10;
        }  
        return number%(sum+product)==0;     
    }
}