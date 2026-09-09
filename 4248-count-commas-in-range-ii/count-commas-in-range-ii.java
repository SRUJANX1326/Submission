class Solution {
    public long commas(String S){
        if(S.length()%3==0) return (S.length()/3)-1;
        return S.length()/3;
    }

    public long countCommas(long n) {
        if(n<1000){
            return 0;
        }
        long count=0;
        for(long i=1000; i<=n; i*=10){
            long end = Math.min(n, i * 10 - 1);
            long numbersInRange = end - i + 1; 
            
            count += numbersInRange * commas(Long.toString(i));
        } 
        return count;
    }
}