class Solution {
    public int UDF(int num){
        int ans=0;
        while(num>0){
            int r=num%10;
            num=num/10;
            ans+=r;
        }
        return ans;
    }
    public int addDigits(int num) {
        int ans=UDF(num);
        while(ans>=10) ans=UDF(ans);
        return ans;
    }
}