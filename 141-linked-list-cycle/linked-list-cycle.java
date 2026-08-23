public class Solution {
    public boolean hasCycle(ListNode head) {
        ArrayList<ListNode> items=new ArrayList<>();
        try{
        while (head.next!=null){
            if (items.contains(head)){
                return true;
            }else{
                items.add(head);
            
                head=head.next;
            }          
        }
        return false;
        }
        catch(Exception E){
            return false;
        }
    }
}