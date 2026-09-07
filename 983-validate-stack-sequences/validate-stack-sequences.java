class Solution {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        boolean condition = true;
        ArrayList AL = new ArrayList();
        int i = 0;
        int j = 0;
        int k=0;
        AL.add(pushed[k]);
        k++;
        while (k < pushed.length-1 || j < popped.length-1) {
            if(i<0 && k < pushed.length){
                AL.add(pushed[k]);
                i++;
                k++;
            }
            if ((int) AL.get(i) != popped[j] && k < pushed.length) {
                AL.add(pushed[k]);
                i++;
                k++;
            }else if((int) AL.get(i) == popped[j]) {
                AL.removeLast();
                i--;
                j++;
            }else{
                condition=false;
                break;
            }
        }
        return condition;
    }
}