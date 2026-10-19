class Solution {
    public int[] evenOddBit(int n) {
        String bin=Integer.toBinaryString(n);
        int even=0;
        int odd=0;
        for(int i=bin.length()-2;i>=0;i-=2){
            if(bin.charAt(i)=='1') even++;
        }
        for(int i=bin.length()-1;i>=0;i-=2){
            if(bin.charAt(i)=='1') odd++;
        }
        return new int[]{odd,even};
    }
}