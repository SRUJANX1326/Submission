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
    public ListNode oddEvenList(ListNode head) {
        ListNode StoredHead=head;
        ArrayList<Integer> AL=new ArrayList<>();
        int i=0;
        while(head!=null){
            if(i%2==0){
                AL.add(head.val);
            }
            i++;
            head=head.next;
        }
        head=StoredHead;
        i=0;
        while(head!=null){
            if(i%2!=0){
                AL.add(head.val);
            }
            i++;
            head=head.next;
        }
        ListNode NewHead=new ListNode();
        StoredHead=NewHead;
        for(i=0;i<AL.size()-1;i++){
            NewHead.val=AL.get(i);
            NewHead.next=new ListNode();
            NewHead=NewHead.next;
        }
        try{
            NewHead.val=AL.get(AL.size()-1);
        }catch(Exception E){
            return null;
        }
        return StoredHead;

    }
}