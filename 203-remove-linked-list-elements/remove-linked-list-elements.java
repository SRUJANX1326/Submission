/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode removeElements(ListNode head, int val) {
        if(head==null) return head;
        ArrayList<Integer> step=new ArrayList<>();
        while(head.next!=null){
            step.add(head.val);
            head=head.next;
        }
        step.add(head.val);
        ListNode NEW=new ListNode();
        ListNode StoredHead=NEW;
        int i;
        for(i=0;i<step.size();i++){
            if(step.get(i)!=val){
                NEW.val=step.get(i);
                NEW.next=new ListNode();
                NEW=NEW.next;
            }
        }
        NEW=StoredHead;
        try{
        do{
            if(NEW.next.next==null){
                NEW.next=null;
                break;
            }
            NEW=NEW.next;
        }while(NEW.next!=null);
        }catch(Exception E){
            return null;
        }
        return StoredHead;
    }
}