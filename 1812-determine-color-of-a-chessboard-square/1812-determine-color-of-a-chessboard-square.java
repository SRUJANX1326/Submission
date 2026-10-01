class Solution {
    public boolean squareIsWhite(String c) {
        int n=c.charAt(0)%8+Character.getNumericValue(c.charAt(1));
    return n%2!=0;
    }
}