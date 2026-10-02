class Solution {
    public String generateTheString(int n) {
        if(n%2==0)  return new String("a".repeat(n-1)) + 'b';
        return new String("a".repeat(n));
        

    }
}