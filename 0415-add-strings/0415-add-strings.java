class Solution {
    public String addStrings(String num1, String num2) {
        int temp = 0;
        String ans = "";
        int i;
        int j;

        for (i = num1.length() - 1, j = num2.length() - 1; i >= 0 && j >= 0; i--, j--) {
            temp += Character.getNumericValue(num1.charAt(i)) + Character.getNumericValue(num2.charAt(j));
            if (temp < 10) {
                ans = Integer.toString(temp) + ans;
                temp = 0;
            } else {
                int r = temp % 10;
                ans = Integer.toString(r) + ans;
                temp = temp / 10;
            }
        }
        
        if (num1.length() > num2.length()) {
            
                while (i >= 0) {
                    temp += Character.getNumericValue(num1.charAt(i));
                    if (temp < 10) {
                        ans = Integer.toString(temp) + ans;
                        temp = 0;
                    } else {
                        int r = temp % 10;
                        ans = Integer.toString(r) + ans;
                        temp = temp / 10;
                    }
                    i--;
                }
            }
         else if (num1.length() < num2.length()) {
            
                while (j >= 0) {
                    temp += Character.getNumericValue(num2.charAt(j));
                    if (temp < 10) {
                        ans = Integer.toString(temp) + ans;
                        temp = 0;
                    } else {
                        int r = temp % 10;
                        ans = Integer.toString(r) + ans;
                        temp = temp / 10;
                    }
                    j--;
                }
            }
            if(temp!=0) {ans=Integer.toString(temp)+ans; return ans;}
        return ans;
}}
