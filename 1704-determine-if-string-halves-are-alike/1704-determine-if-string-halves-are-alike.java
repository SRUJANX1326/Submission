class Solution {
    public boolean halvesAreAlike(String s) {
        HashMap<Character, Integer> one = new HashMap<>();
        one.put('a', 0);
        one.put('e', 0);
        one.put('i', 0);
        one.put('o', 0);
        one.put('u', 0);
        one.put('A', 0);
        one.put('E', 0);
        one.put('I', 0);
        one.put('O', 0);
        one.put('U', 0);
        
        HashMap<Character, Integer> two = new HashMap<>(one);
        
        int i;
        for (i = 0; i < s.length() / 2; i++) {
            if (one.containsKey(s.charAt(i))) {
                one.put(s.charAt(i), one.get(s.charAt(i)) + 1);
            }
        }
        
        for (; i < s.length(); i++) {
            if (two.containsKey(s.charAt(i))) {
                two.put(s.charAt(i), two.get(s.charAt(i)) + 1);
            }
        }
        
        char[] vowels = {'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'};
        
        int countOne = 0;
        int countTwo = 0;
        for (char x : vowels) {
            countOne += one.get(x);
            countTwo += two.get(x);
        }
        
        return countOne == countTwo;
    }
}