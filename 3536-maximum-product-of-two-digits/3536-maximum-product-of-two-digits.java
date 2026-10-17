class Solution {
    public int maxProduct(int n) {
        int largest=-1;
        int larger=-1;
        while(n>0){
            int digit=n%10;
            if(digit>=largest){
                larger=largest;
                largest=digit;
            }else if(digit>larger){
                larger=digit;
            }
            n=n/10;
        }
        return largest*larger;
    }
}