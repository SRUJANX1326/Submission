class Solution {
    public int divisorSubstrings(int num, int k) {
        int count=0;
        String s=Integer.toString(num);
        for(int i=0;i+k<=s.length()  ;i++){
            try{
                if(num%Integer.parseInt(s.substring(i,i+k))==0) count++;
            }catch(Exception E){

            }
        }
        return count;
    }
}