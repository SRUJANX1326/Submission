class Solution {
    public boolean isPerfectSquare(int num) {
        if(num==1) return true;
        for(int i=0;i<num/1.9;i++){
            if(i*i==num) return true;
        }
        return false;
    }
}