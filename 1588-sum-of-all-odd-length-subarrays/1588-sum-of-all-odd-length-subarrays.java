class Solution {
    public int listSum(int[] arr){
        int temp=0;
        for(int i=0;i<arr.length;i++){
            temp+=arr[i];
        }
        return temp;
    }
    public int sumOddLengthSubarrays(int[] arr) {
        int sum=0;
        for(int i=1;i<=arr.length;i+=2){
            for(int j=0;i+j<=arr.length;j++){
                sum+=listSum(Arrays.copyOfRange(arr,j,i+j));
            }
        }
        return sum;
    }
}