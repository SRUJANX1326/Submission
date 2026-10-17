class Solution {
    public int largestInteger(int[] nums, int k) {
        ArrayList<Integer> AL = new ArrayList<>();
        for (int i = 0; i + k <= nums.length; i++) {
            int[] temp = Arrays.copyOfRange(nums, i, i + k);

            HashSet<Integer> windowSet = new HashSet<>();
            for (int x : temp) {
                windowSet.add(x);
            }
 
            for (int x : windowSet) {
                AL.add(x);
            }
        }
        
        HashSet<Integer> mingle = new HashSet();
        HashSet<Integer> single = new HashSet();
        for (int i = 0; i < AL.size(); i++) {
            if (mingle.contains(AL.get(i))) continue;
            if (single.contains(AL.get(i))) {
                single.remove(Integer.valueOf(AL.get(i)));
                mingle.add(AL.get(i));
            } else {
                single.add(AL.get(i));
            }
        }
        
        if (single.isEmpty()) {
            return -1;
        }
        return Collections.max(single);
    }
}