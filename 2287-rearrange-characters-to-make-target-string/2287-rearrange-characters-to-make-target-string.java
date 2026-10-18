class Solution {
    public int rearrangeCharacters(String s, String target) {
        ArrayList<Character> AL=new ArrayList();
        for(char x: s.toCharArray()){
            AL.add(x);
        }
        int count=0;
        while (true){
            for(int i=0;i<target.length();i++){
                if(AL.contains(target.charAt(i))){
                    AL.remove(Character.valueOf(target.charAt(i)));
                }else{
                    return count;
                }
            }
            count++;
        }
    }
}