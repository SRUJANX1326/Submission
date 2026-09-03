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
    public ListNode modifiedList(int[] nums, ListNode head) {
        Set<Integer> set = new HashSet<>();
for (int num : nums) {
    set.add(num);
}
        ListNode newList=new ListNode();
        ListNode StoredHead=newList;
        while(head!=null){
            if(!(set.contains(head.val))){
                newList.val=head.val;
                newList.next=new ListNode();
                newList=newList.next;
            }
            head=head.next;
        }
        head=StoredHead;
        while(head.next.next!=null){
            head=head.next;
        }
        head.next=null;
        return StoredHead;
    }
}