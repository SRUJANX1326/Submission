class Solution {
    public int frequency(String s , char target){
        int count=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==target) count++;
        }
        return count;
    }
    public int firstUniqChar(String s) {
        HashMap<Character,Integer> TM=new HashMap();
        for(int i=0;i<s.length();i++){
            if(!TM.containsKey(s.charAt(i))){
                TM.put(s.charAt(i),frequency(s,s.charAt(i)));
            }
        }
        for(int i=0;i<s.length();i++){
            if(TM.get(s.charAt(i))==1) return i;
        }
        return -1;
    }
}