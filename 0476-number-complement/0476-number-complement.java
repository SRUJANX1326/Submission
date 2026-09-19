class Solution {
    public int findComplement(int num) {
        String binary=Integer.toBinaryString(num);
        String s="";
        for(int i=0;i<binary.length();i++){
            if(binary.charAt(i)=='0') s+="1";
            else s+="0";
        }
        num=Integer.parseInt(s,2);
        return num;
    }
}