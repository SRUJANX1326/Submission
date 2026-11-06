class Solution {
    public boolean areAlmostEqual(String s1, String s2) {
        ArrayList<Character> AL_one=new ArrayList();
        ArrayList<Character> AL_two=new ArrayList();
        for(int i=0;i<s1.length();i++){
            if(s1.charAt(i)!=s2.charAt(i)){
                AL_one.add(s1.charAt(i));
                AL_two.add(s2.charAt(i));
            }
        }
        Collections.sort(AL_one);
        Collections.sort(AL_two);
        return s1.equals(s2) || (AL_one.size()==2 && AL_two.size()==2 && (AL_one.get(0)==AL_two.get(0) && AL_one.get(1)==AL_two.get(1)));
    }
}