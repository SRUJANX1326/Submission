class Solution {
    public boolean isPowerOfTwo(int n) {
        if(n<=0) return false;
        int max=1073741824;
        if(max%n==0) return true;
        return false;
    }
}