class Solution {
    public String maximumOddBinaryNumber(String s) {
        int one_count=0;
        int two_count=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='0') two_count++;
            else one_count++;
        }
        String ans="1";
        one_count--;
        while(two_count!=0){
            ans= "0" + ans;
            two_count--;
        }
        while(one_count!=0){
            ans= "1" + ans;
            one_count--;
        }
        return ans;
    }
}