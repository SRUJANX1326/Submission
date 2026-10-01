class Solution {
    public int sum(int low,int high){
        int total=high*(high+1)/2;
        int cut=(low-1)*(low)/2;
        return total-cut;
    }
    public int pivotInteger(int n) {
        for(int i=1;i<=n;i++){
            if(sum(1,i)==sum(i,n)) return i;
        }
        return -1;
    }
}