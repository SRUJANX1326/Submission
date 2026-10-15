class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int count=0;
        for(int i=0;i+k<=arr.length;i++){
            int[] temp=Arrays.copyOfRange(arr,i,i+k);
            int sum=0;
            int n=temp.length;
            for(int j=0;j<n;j++){
                sum+=temp[j];
            }
            if(sum/n>=threshold) count++;
        }
        return count;
    }
}