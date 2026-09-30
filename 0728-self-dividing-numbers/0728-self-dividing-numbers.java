class Solution {
    public boolean SDN(int n){
        String s=Integer.toString(n);
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='0') return false;
            if(n%Character.getNumericValue(s.charAt(i))!=0) return false;
        }
        return true;
    }
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> ans=new ArrayList();
        for(int i=left;i<=right;i++){
            if(SDN(i)) ans.add(i);
        }
        return ans;
    }
}