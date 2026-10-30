class Solution {
    public String clearDigits(String s) {
        ArrayList<Character> letter=new ArrayList();
        ArrayList<Character> number=new ArrayList();
        for(int i=0;i<s.length();i++){
            if(Character.isLetter(s.charAt(i))){
                letter.add(s.charAt(i));
            }else if(Character.isDigit(s.charAt(i)) && !letter.isEmpty()){
                letter.removeLast();
            }else if(Character.isDigit(s.charAt(i)) && letter.isEmpty()){
                number.add(s.charAt(i));
            }
        }
        String temp="";
        
        for(int i=number.size()-1;i>=0;i--){
            temp+=number.get(i);
        }
        for(int i=0;i<letter.size();i++){
            temp+=letter.get(i);
        }
        return temp;
    }
}