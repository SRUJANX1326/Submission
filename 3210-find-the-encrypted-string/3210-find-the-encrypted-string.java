class Solution {
    public String getEncryptedString(String s, int k) {
        String encrypted="";
        int mod=s.length();
        char[] s_array=s.toCharArray();
        for(int i=0;i<mod;i++){
            encrypted+=s_array[(i+k)%mod];
        }
        return encrypted;
    }
}