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
    public int greatestCommonDivisor(int a, int b){
        int r;
        while(b!=0){
            r=a%b;
            a=b;
            b=r;
        }
        return a;
    }
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        ListNode newList=new ListNode();;
        ListNode StoredHead=newList;
        ListNode prev=head;
        newList.val=prev.val;
        newList.next=new ListNode();
        head=head.next;
        while(head!=null){
            int AppendValue=greatestCommonDivisor(prev.val,head.val);
            newList=newList.next;
            newList.val=AppendValue;
            newList.next=new ListNode();
            newList=newList.next;
            newList.val=head.val;
            prev=prev.next;
            head=head.next;
            newList.next=new ListNode();
        }
        head=StoredHead;
        while(head.next.next!=null){
            head=head.next;
        }
        head.next=null;
        return StoredHead;
    }
    
}