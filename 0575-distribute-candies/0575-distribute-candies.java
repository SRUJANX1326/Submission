class Solution {
    public int distributeCandies(int[] candyType) {
        HashSet<Integer> HS=new HashSet();
        int len=candyType.length;
        for(int i=0;i<len && HS.size()<len/2;i++){
            HS.add(candyType[i]);
        }
        if (HS.size()>=len/2)
            return len/2;
        else
            return HS.size();
        
    }
}