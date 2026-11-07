class Solution {
    public int minOperations(String s) {
        int one=0;
        int two=0;
        for(int i=0;i<s.length();i++){
            if(i%2==0) if(s.charAt(i)!='0') one++;
            if(i%2!=0) if(s.charAt(i)!='1') one++;
            if(i%2==0) if(s.charAt(i)!='1') two++;
            if(i%2!=0) if(s.charAt(i)!='0') two++;
        }
        if(one<two) return one;
        return two;
    }
}