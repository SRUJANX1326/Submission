class Solution {
    public int furthestDistanceFromOrigin(String moves) {
        int count_L=0;
        int count_R=0;
        int count__=0;
        for(int i=0;i<moves.length();i++){
            if(moves.charAt(i)=='L') count_L++;
            else if(moves.charAt(i)=='R') count_R++;
            else count__++;
        }
        if(count_R>=count_L) return count_R+count__-count_L;
        return count_L+count__-count_R;
    }
}