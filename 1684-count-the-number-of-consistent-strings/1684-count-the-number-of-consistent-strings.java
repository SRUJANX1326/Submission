class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        int count=0;
        for(String s : words){
            for(int i=0;i<s.length();i++){
                if(!(allowed.contains(Character.toString(s.charAt(i))))){
                    count--;
                    break;
                }
            }
            count++;
        }
        return count;
    }
}