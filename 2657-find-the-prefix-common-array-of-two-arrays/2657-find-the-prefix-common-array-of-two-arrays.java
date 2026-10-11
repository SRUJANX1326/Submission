class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        HashSet<Integer> one = new HashSet<>();
        HashSet<Integer> two = new HashSet<>();
        HashSet<Integer> temp;
        int n = A.length;
        int[] C = new int[n];
        int commonCount = 0;
        for(int i=0;i<n;i++){
            one.add(A[i]);
            if (two.contains(A[i])) {
                commonCount++;
            }
            two.add(B[i]);
            if (one.contains(B[i])) {
                commonCount++;
            }
            C[i] = commonCount;
        }
        return C;
    }
}