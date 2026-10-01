class Solution {
    public int numberOfSteps(int num) {
        int count=0;
        while(true){
            if(num==0) break;
            if(num%2==0)    {num=num/2; count++;}
            else {num-=1; count++;}
        }
        return count;
    }
}