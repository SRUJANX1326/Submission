class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max_candies=0;
        for(int i=0;i<candies.length;i++){
            if(candies[i]>max_candies) max_candies=candies[i];
        }
        boolean[] ans=new boolean[candies.length];
        for(int i=0;i<candies.length;i++){
            candies[i]=candies[i]+extraCandies;
            if(candies[i]>=max_candies){
                ans[i]=true;
                
            }
        }
        List<Boolean> final_ans=new ArrayList();
        for(int i=0;i<ans.length;i++){
            final_ans.add(ans[i]);
        }
        return final_ans;
    }
}