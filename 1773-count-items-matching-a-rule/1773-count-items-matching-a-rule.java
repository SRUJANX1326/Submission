class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int ans=0;
        for(int i=0;i<items.size();i++){
            if("type".equals(ruleKey) && items.get(i).get(0).equals(ruleValue)) ans++;
            else if("color".equals(ruleKey) && items.get(i).get(1).equals(ruleValue)) ans++;
            else if("name".equals(ruleKey) && items.get(i).get(2).equals(ruleValue)) ans++;
        }
        return ans;
    }
}