class Solution {
    public int distributeCandies(int[] candyType) {
        HashSet<Integer> HS=new HashSet();
        for(int i=0;i<candyType.length && HS.size()<=candyType.length/2;i++){
            HS.add(candyType[i]);
        }
        if (HS.size()>=candyType.length/2)
            return candyType.length/2;
        else
            return HS.size();
        
    }
}