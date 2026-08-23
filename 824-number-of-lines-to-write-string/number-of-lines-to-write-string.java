class Solution {
    public int[] numberOfLines(int[] widths, String s) {
        HashMap<Character,Integer> HM=new HashMap<>();
        char basic='a';
        for(int i=0;i<26;i++){
            HM.put(basic,widths[i]);
            basic++;
        }
        int line=0;
        int limit=100;
        int line_size=0;

        for(int i=0;i<s.length();i++){
            int current=HM.get(s.charAt(i));
            if(current+line_size>limit){
                line++;
                line_size=current;
            }else{
                line_size=current+line_size;
            }
        }
        int[] ans={line+1,line_size};
        return ans;
    }
}