class Solution {
    public int alternateDigitSum(int n) {
        ArrayList<Integer> temp=new ArrayList();
        while(n>0){
            int r=n%10;
            temp.addFirst(r);
            n=n/10;
        }
        boolean condition=true;
        int ans=0;
        for(int i=0;i<temp.size();i++){
            if(condition){
                ans+=temp.get(i);
                condition=false;
            }else{
                ans-=temp.get(i);
                condition=true;
            }
        }
        return ans;
    }
}