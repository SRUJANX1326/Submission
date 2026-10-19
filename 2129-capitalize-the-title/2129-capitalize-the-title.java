class Solution {
    public String capitalizeTitle(String title) {
        String[] words=title.split(" ");
        String ans="";
        for(int i=0;i<words.length;i++){
            if(words[i].length()<=2){
                ans+=words[i].toLowerCase()+" ";
            }else{
                String temp=words[i].substring(0,1).toUpperCase()+words[i].substring(1,words[i].length()).toLowerCase();
                ans+=temp+" ";
            }
        }
        return ans.substring(0,ans.length()-1);
    }
}