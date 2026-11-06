class Solution {
    public boolean checkZeroOnes(String s) {
        int one=0;
        int two=0;
        int max=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='1'){
                one++;
            }else{
                one=0;
            }
            if(max<one) max=one;
        }
        one=max;
        max=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='0'){
                two++;
            }else{
                two=0;
            }
            if(max<two) max=two;
        }
        two=max;
        return one>two;
    }
}