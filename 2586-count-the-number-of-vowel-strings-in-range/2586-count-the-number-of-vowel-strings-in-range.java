class Solution {
    public int vowelStrings(String[] words, int left, int right) {
        int count=0;
        HashSet<Character> vowels=new HashSet(Set.of('a','e','i','o','u'));
        for(int i=left;i<=right;i++){
            if(vowels.contains(words[i].charAt(0)) && vowels.contains(words[i].charAt(words[i].length()-1))) count++;
        }
        return count;
    }
}