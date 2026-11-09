class Solution {
    public int[] getNoZeroIntegers(int n) {
        for(int i=1;i<n;i++){
            if(!(Integer.toString(n-i).contains("0")) && !(Integer.toString(i).contains("0"))) return new int[]{n-i,i};
        }
        return new int[]{};
    }
}