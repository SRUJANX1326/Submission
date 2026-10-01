class Solution {
    public boolean isSameAfterReversals(int num) {
        String temp=Integer.toString(num);
        String reverse1="";
        for(int i=temp.length()-1;i>=0;i--){
            reverse1+=temp.charAt(i);
        }
        String reverse2="";
        int t=Integer.parseInt(reverse1);
        reverse1=Integer.toString(t);
        for(int i=reverse1.length()-1;i>=0;i--){
            reverse2+=reverse1.charAt(i);
        }
        int new_num=Integer.parseInt(reverse2);
        return new_num==num;
    }
}