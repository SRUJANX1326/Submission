/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public void deleteNode(ListNode node) {
        ListNode saved=new ListNode();
        while(node.next!=null){
            node.val=node.next.val;
            saved=node;
            node=node.next;
        }
        saved.next=null;
    }
}