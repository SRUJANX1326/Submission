class Solution {
    public String removeStars(String s) {
        ArrayList<Character> stack=new ArrayList();
        String ans="";
        for(int i=s.length()-1;i>=0;i--){
            if(s.charAt(i)=='*') stack.add('*');
            else if(!stack.isEmpty()) stack.removeLast();
            else ans=Character.toString(s.charAt(i))+ans;
        }
        return ans;
    }
}