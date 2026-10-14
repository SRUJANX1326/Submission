class Solution {
    public int findPoisonedDuration(int[] timeSeries, int duration) {
        int count=0;
        int end_time=0;
        int i=0;
        for(i=0;i<timeSeries.length-1;i++){
            if(timeSeries[i]+duration<timeSeries[i+1]){
                count+=duration;
            }else{
                count+=timeSeries[i+1]-timeSeries[i];
            }
        }
        count+=duration;
        return count;
    }
}