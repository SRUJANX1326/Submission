class Solution {
    public int maxNumberOfBalloons(String text) {
        ArrayList<Character> AL=new ArrayList();
        for(int i=0;i<text.length();i++){
            AL.add(text.charAt(i));
        }
        int count=0;
        while(true){
            for(char x: "balloon".toCharArray()){
                if(AL.contains(x)){
                    AL.remove(Character.valueOf(x));
                }else{
                    return count;
                }
            }
            count++;
        }
        
    }
}