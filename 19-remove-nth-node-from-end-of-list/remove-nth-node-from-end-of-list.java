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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head==null || head.next==null) return null;
        if(head.next.next==null) {
            if (n==1){
                head.next=null;
                return head;
            }else{
                head=head.next;
                return head;
            }
        }

        ListNode StoredHead=head;
        int ln=0;
        while(head!=null){
            head=head.next;
            ln++;
        }
        int node=ln-n;
        head=StoredHead;
        int count=0;
        if(node<=count){
                head=head.next;
                return head;
            }
        while(head!=null){
            
            if(count+1==node){
                head.next=head.next.next;
                break;
            }
            head=head.next;
            
            count++;
        }
        return StoredHead;
    }
}