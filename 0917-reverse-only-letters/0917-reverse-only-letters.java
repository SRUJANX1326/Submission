class Solution {
    public String reverseOnlyLetters(String s) {
        ArrayList<Character> AL=new ArrayList();
        for(int i=s.length()-1;i>=0;i--){
            if(Character.isLetter(s.charAt(i))){
                AL.add(s.charAt(i));
            }
        }
        String ans=new String();
        int j=0;
        int i=0;
        for(i=0;i<s.length() && j<AL.size();i++){
            if(Character.isLetter(s.charAt(i))){
                ans+=AL.get(j);
                j++;
            }else{
                ans+=s.charAt(i);
            }
        }
        while(i<s.length()){
            ans+=s.charAt(i);
            i++;
        }
        return ans;
    }
}