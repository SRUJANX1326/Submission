class Solution {
    public int largestAltitude(int[] gain) {
        int now=0;
        int max=0;
        for(int i=0;i<gain.length;i++){
            now+=gain[i];
            if(now>max){
                max=now;
            }
        }
        return max;
    }
}