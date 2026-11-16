class Solution {
    public String destCity(List<List<String>> paths) {
        HashSet<String> HS=new HashSet();
        for(int i=0;i<paths.size();i++){
            HS.add(paths.get(i).get(1));
        }
        for(int i=0;i<paths.size();i++){
            HS.remove(paths.get(i).get(0));
        }
        String ans=HS.iterator().next();
        return ans;
    }
}