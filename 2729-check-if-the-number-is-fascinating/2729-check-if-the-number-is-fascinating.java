class Solution {
    public boolean isFascinating(int n) {
        String one=Integer.toString(n);
        String two=Integer.toString(2*n);
        String three=Integer.toString(3*n);
        one=one+two+three;
        HashSet<Character> temp=new HashSet<>(Arrays.asList('1','2','3','4','5','6','7','8','9'));
        for(char x: one.toCharArray()){
            if(temp.contains(x)) temp.remove(x);
            else return false;
        }
        return temp.size()==0;

    }
}