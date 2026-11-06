class Solution {
    public int differenceOfSums(int n, int m) {
        int count_one=0, count_two=0;
        for(int i=1;i<=n;i++) if(i%m==0) count_one+=i;
        else count_two+=i;
        return count_two-count_one;
    }
}