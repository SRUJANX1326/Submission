class Solution {
    public int countOdds(int low, int high) {
        if(high%2==0 && low%2==0){
            return (high-low)/2;
        }
        if(high%2==0 || low%2==0 || high%2!=0 || low%2!=0 ){
            return 1+(high-low)/2;
        }
        return -1;
    }
}