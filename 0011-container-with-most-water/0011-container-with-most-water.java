class Solution {
    public int calculateVolume(int h,int b){
        return h*b;
    }
    public int maxArea(int[] height) {
        int i=0;
        int j=height.length-1;
        int maxVolume=0;
        while(i<j){
            int temp=calculateVolume(Math.min(height[i],height[j]),j-i);
            if(temp>maxVolume) maxVolume=temp;
            if(height[i]<height[j]) i++;
            else j--;
        }
        return maxVolume;
    }
}