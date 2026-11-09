class Solution {
    ArrayList<Character> temp;
    public String textEditor(String s){
        temp=new ArrayList();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='#') try { temp.removeLast(); } catch(Exception E) { }
            else { temp.add(s.charAt(i)); }
        }
        String ans="";
        for(int i=0;i<temp.size();i++){
            ans+=temp.get(i);
        }
        return ans;
    }
    public boolean backspaceCompare(String s, String t) {
        ArrayList<Character> one=new ArrayList();
        String one_string=textEditor(s);
        ArrayList<Character> two=new ArrayList();
        String two_string=textEditor(t);
        return one_string.equals(two_string);
    }
}