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
    public ListNode reverseList(ListNode head) {
        try{
            if (head.next==null){
            return head;
            }
        }catch(Exception E){
            return head;
        }
        ListNode StoreHead=head;
        ArrayList<Integer> arr=new ArrayList<>();
        while(head.next!=null){
            arr.add(0,head.val);
            head=head.next;
        }
        arr.add(0,head.val);
        head=StoreHead;
        for(int i=0;i<arr.size();i++){
            head.val=arr.get(i);
            head=head.next;
        }
        return StoreHead;
    }
}