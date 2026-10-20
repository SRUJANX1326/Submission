class Solution {
    public int indexOf(String[] list2, String temp){
        for(int i=0;i<list2.length;i++){
            if(list2[i].equals(temp)){
                return i;
            }
        }
        return -1;
    }
    public String[] findRestaurant(String[] list1, String[] list2) {
        TreeMap<Integer,ArrayList<String>> HM=new TreeMap();
        int min_idx=Integer.MAX_VALUE;
        HashSet<String> two=new HashSet();
        for(String y:list2) two.add(y);
        for(int i=0;i<list1.length;i++){
            if(two.contains(list1[i])){
                int index=indexOf(list2,list1[i]);
                int value=i+index;
                if(value<min_idx) min_idx=value;
                if(!HM.containsKey(value))
                    HM.put(value,new ArrayList(List.of(list1[i])));
                else
                    HM.get(value).add(list1[i]);
            }
        }
        String[] ans=new String[HM.get(min_idx).size()];
        for(int i=0;i<ans.length;i++){
            ans[i]=HM.get(min_idx).get(i);
        }
        return ans;
    }
}