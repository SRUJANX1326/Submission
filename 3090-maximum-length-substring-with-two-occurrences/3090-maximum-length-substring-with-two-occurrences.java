class Solution {
    public boolean valid(String s){
        ArrayList<Character> AL=new ArrayList();
        for(Character c: s.toCharArray()){
            AL.add(c);
        }
        for(int i=0;i<AL.size();i++){
            if(Collections.frequency(AL,AL.get(i))>2) return false;
        }
        return true;
    }
    public int maximumLengthSubstring(String s) {
        int n=s.length();
        for(int i=n;i>=1;i--){
            for(int j=0;i+j<=n;j++){
                if(valid(s.substring(j,i+j))){
                    return i;
                }
            }
        }
        return -1;
    }
}