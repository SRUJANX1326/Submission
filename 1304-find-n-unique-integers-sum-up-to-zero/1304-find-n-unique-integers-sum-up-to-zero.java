class Solution {
    public int[] sumZero(int n) {
        if(n%2==0){
            int[] arr=new int[n];
            for(int i=0;i<n-1;i++){
                arr[i]=i+1;
                arr[i+1]=-(i+1);
                i++;
            }
            return arr;
        }else if(n%2!=0){
            int[] arr=new int[n];
            arr[0]=0;
            for(int i=1;i<n-1;i++){
                arr[i]=i+1;
                arr[i+1]=-(i+1);
                i++;
            }
            return arr;
        }
        return new int[]{};
    }
}