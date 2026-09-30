class Solution {
    public boolean isBalanced(String num) {
        int even=0;
        int odd=0;
        for(int i=0;i<num.length();i+=2){
            even+=Character.getNumericValue(num.charAt(i));
        }
        for(int i=1;i<num.length();i+=2){
            odd+=Character.getNumericValue(num.charAt(i));
        }
        return even==odd;
    }
}