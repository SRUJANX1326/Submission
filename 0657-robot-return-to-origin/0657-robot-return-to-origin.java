class Solution {
    public boolean judgeCircle(String s) {
        int x=0;
        int y=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='U'){
                y+=1;
            }else if(s.charAt(i)=='D'){
                y-=1;
            }else if(s.charAt(i)=='L'){
                x-=1;
            }else if(s.charAt(i)=='R'){
                x+=1;
            }
        }
        return x==0 && y==0;
    }
}