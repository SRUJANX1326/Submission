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
    public ListNode swap(ListNode one,ListNode two){
        if(two==null) return one;
        ListNode t=two.next;
        two.next=one;
        one.next=t;
        return two;
    }
    public ListNode swapPairs(ListNode head) {
        if(head==null || head.next==null) return head;
        ListNode StoredHead=swap(head,head.next);
        ListNode temp=head;
        head=temp.next;
        while(head!=null){
            temp.next=swap(head,head.next);
            temp=temp.next.next;
            try{
                head=temp.next;
            }catch(Exception E){
                return StoredHead;
            }
        }
        return StoredHead;
    }
}