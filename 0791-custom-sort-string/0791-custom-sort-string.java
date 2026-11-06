class Solution {
    public String customSortString(String order, String s) {
        List<Character> both=new ArrayList();
        List<Character> one=new ArrayList();
        for(int i=0;i<s.length();i++){
            if(order.contains(Character.toString(s.charAt(i)))) both.add(s.charAt(i));
            else one.add(s.charAt(i));
        }
        String ans="";
        for(char x: order.toCharArray()){
            while(both.contains(x)){
                ans+=x;
                both.remove(Character.valueOf(x));
            }
        }
        for(int i=0;i<one.size();i++){
            ans+=one.get(i);
        }
        return ans;
    }
}