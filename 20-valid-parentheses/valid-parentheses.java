class Solution {
    public boolean isValid(String s) {
        ArrayList<Character> stack=new ArrayList();
        ArrayList<Character> open = new ArrayList<>(List.of('(', '{', '['));
        ArrayList<Character> close = new ArrayList<>(List.of(')', '}',  ']'));
        for(char ch: s.toCharArray()){
            if(open.contains(ch)){
                stack.addLast(ch);
                continue;
            }
            if(close.contains(ch)){
                if(stack.isEmpty()) return false;
                int index=open.indexOf(stack.getLast());
                if(ch!=close.get(index)) return false;
                stack.removeLast();
            }     
        }
        return stack.isEmpty();
    }
}