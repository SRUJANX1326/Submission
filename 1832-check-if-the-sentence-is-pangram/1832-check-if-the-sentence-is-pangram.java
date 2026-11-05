class Solution {
    public boolean checkIfPangram(String sentence) {
        HashSet<Character> Letters=new HashSet();
        for(int i=97;i<97+26;i++){
            Letters.add((char)i);
        }
        for(char x : sentence.toCharArray()){
            Letters.remove(x);
        }
        return Letters.isEmpty();
    }
}