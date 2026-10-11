class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        HashSet<Integer> one=new HashSet();
        HashSet<Integer> two=new HashSet();
        int n=A.length;
        int[] C=new int[n];
        for(int i=0;i<n;i++){
            one.add(A[i]);
            two.add(B[i]);
            HashSet<Integer> temp=new HashSet(one);
            temp.retainAll(two);
            C[i]=temp.size();
        }
        return C;
    }
}