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
    public ListNode sortList(ListNode head) {
        if(head==null || head.next==null){
            return head;
        }
        ArrayList temp=new ArrayList();
        while(head!=null){
            temp.add(head.val);
            head=head.next;
        }
        Collections.sort(temp);
        head=new ListNode();
        ListNode StoredHead=head;
        for(int i=0;i<temp.size()-1;i++){
            head.val=(int)temp.get(i);
            head.next=new ListNode();
            head=head.next;
        }
        head.val=(int)temp.getLast();
        return StoredHead;
    }
}