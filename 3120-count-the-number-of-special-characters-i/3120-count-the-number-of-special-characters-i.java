class Solution {
    public int numberOfSpecialChars(String word) {
        ArrayList<Character> AL=new ArrayList();
        HashSet<Character> HS=new HashSet();
        int n=word.length();
        int count=0;
        for(int i=0;i<n;i++){
            if(HS.contains(word.charAt(i))){
                continue;
            }
            HS.add(word.charAt(i));
            if(Character.isLowerCase(word.charAt(i)) && AL.contains(Character.toUpperCase(word.charAt(i)))){
                AL.remove(Character.valueOf(Character.toUpperCase(word.charAt(i))));
                count++;
            }else if(Character.isUpperCase(word.charAt(i)) && AL.contains(Character.toLowerCase(word.charAt(i)))){
                AL.remove(Character.valueOf(Character.toLowerCase(word.charAt(i))));
                count++;
            }else{
                AL.add(word.charAt(i));
            }
        }
        return count;
    }
}