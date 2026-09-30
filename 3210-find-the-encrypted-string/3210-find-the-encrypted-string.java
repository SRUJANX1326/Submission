class Solution {
    public String getEncryptedString(String s, int k) {
        String encrypted="";
        int mod=s.length();
        for(int i=0;i<s.length();i++){
            encrypted+=s.charAt((i+k)%mod);
        }
        return encrypted;
    }
}