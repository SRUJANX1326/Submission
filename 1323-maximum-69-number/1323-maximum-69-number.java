class Solution {
    public int maximum69Number (int num) {
        String string=Integer.toString(num);
        char[] temp=string.toCharArray();
        for(int i=0;i<temp.length;i++){
            if(temp[i]=='6'){
                temp[i]='9';
                string=new String(temp);
                return Integer.parseInt(string);
            }
        }
        return num;
    }
}