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
    public ListNode middleNode(ListNode head) {
        ArrayList<Integer> temp=new ArrayList<>();
        ListNode StoredHeadAndAns=head;
        while(head!=null){
            temp.add(head.val);
            head=head.next;
        }
        int count=(int)Math.ceil(temp.size()/2);
        for(int i=0;i<count;i++){
            StoredHeadAndAns=StoredHeadAndAns.next;
        }
        return StoredHeadAndAns;
    }
}