class Solution {
    public boolean detectCapitalUse(String s) {
        int choice=-1;
        try{
            if(Character.isUpperCase(s.charAt(0))){
                if(Character.isLowerCase(s.charAt(1))){
                    choice=2;
                }else{
                    choice=1;
                }
            }else{
                choice=3;
            }
        }catch(Exception E){
            return true;
        }

        switch(choice){
            case 1:{
                for(int i=1;i<s.length();i++){
                    if(Character.isLowerCase(s.charAt(i))){ return false;}

                }
                break;
            }
            case 2:{
                for(int i=1;i<s.length();i++){
                    if(Character.isUpperCase(s.charAt(i))) return false;
                }
                break;
            }
            case 3:{
                for(int i=1;i<s.length();i++){
                    if(Character.isUpperCase(s.charAt(i))) return false;
                }
            }
        }
        return true;
    }
}