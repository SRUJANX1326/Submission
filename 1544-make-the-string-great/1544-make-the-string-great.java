class Solution {
    public String makeGood(String s) {
        ArrayList<Character> AL=new ArrayList();
        AL.add(s.charAt(0));
        for(int i=1;i<s.length();i++){
            if(AL.isEmpty()) {AL.add(s.charAt(i)); continue;}
            if(AL.getLast()!=s.charAt(i) && (AL.getLast() == Character.toLowerCase(s.charAt(i)) || 
    AL.getLast() == Character.toUpperCase(s.charAt(i)))){
                AL.removeLast();
            }else{
                AL.add(s.charAt(i));
            }
        }
        String ans="";
        for(int i=0;i<AL.size();i++){
            ans+=AL.get(i);
        }
        return ans;
    }
}