class Solution {
    public String defangIPaddr(String address) {
        String temp="";
        for(int i=0;i<address.length();i++){
              if(address.charAt(i)!='.'){
                temp+=address.charAt(i);
              }else{
                temp+='[';
                temp+=address.charAt(i);
                temp+=']';
              }
        }
        return temp;
    }
}