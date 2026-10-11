class Solution {
    public int POV(String S){
        int ans=0;
        for(int i=1;i<S.length()-1;i++){
            if((Character.getNumericValue(S.charAt(i))>Character.getNumericValue(S.charAt(i-1)) && Character.getNumericValue(S.charAt(i))>Character.getNumericValue(S.charAt(i+1))) || (Character.getNumericValue(S.charAt(i))<Character.getNumericValue(S.charAt(i-1)) && Character.getNumericValue(S.charAt(i))<Character.getNumericValue(S.charAt(i+1)))) ans++;
        }
        return ans;
    }
    public int totalWaviness(int num1, int num2) {
        int ans=0;
        for(int i=num1;i<=num2;i++){
            ans+=POV(Integer.toString(i));
        }
        return ans;
    }
}