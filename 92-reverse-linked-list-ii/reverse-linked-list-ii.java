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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        ArrayList<Integer> AL=new ArrayList<>();
        int i=0;
        int left_index=left-1,right_index=right-1;
        while(head!=null){
            AL.add(head.val);
            head=head.next;
            i++;
        }
        while(left_index<right_index){
            AL.set(left_index,AL.get(left_index)+AL.get(right_index));
            AL.set(right_index,AL.get(left_index)-AL.get(right_index));
            AL.set(left_index,AL.get(left_index)-AL.get(right_index));
            left_index++;
            right_index--;
        }
        ListNode NewList=new ListNode();
        ListNode StoredHead=NewList;
        for(i=0;i<AL.size()-1;i++){
            NewList.val=AL.get(i);
            NewList.next=new ListNode();
            NewList=NewList.next;
        }
       NewList.val=AL.get(i);
       return StoredHead;
    }
}