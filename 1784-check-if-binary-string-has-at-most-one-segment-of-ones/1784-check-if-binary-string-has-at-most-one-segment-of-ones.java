class Solution {
    public boolean checkOnesSegment(String s) {
        int count=0;
        for(int i=1;i<s.length();i++){
            if(s.charAt(i-1)!=s.charAt(i)) count++;
            if(count>=2) return false;
        }
        return true;
    }
}