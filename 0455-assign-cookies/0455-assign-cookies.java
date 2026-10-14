class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int count=0;
        int one=0;
        int two=0;
        int one_end=g.length;
        int two_end=s.length;
        while(one<one_end && two<two_end){
            if(g[one]<=s[two]){
                count++;
                one++;
                two++;
            }else{
                two++;
            }
        }
        return count;
    }
}