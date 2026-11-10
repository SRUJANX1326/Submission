class Solution {
    public int secondHighest(String s) {
        int largest=Integer.MIN_VALUE;
        int second_largest=Integer.MIN_VALUE;
        for(int i=0;i<s.length();i++){
            if(Character.isDigit(s.charAt(i))){
                int num=Character.getNumericValue(s.charAt(i));
                if(num>largest){
                    second_largest=largest;
                    largest=num;
                }else if(num>second_largest && largest!=num){
                    second_largest=num;
                }
            }
        }
        if(largest==second_largest || second_largest==Integer.MIN_VALUE) return -1;
        return second_largest;
    }
}