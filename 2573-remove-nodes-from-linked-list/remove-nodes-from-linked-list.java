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
    public ListNode removeNodes(ListNode head) {
        ArrayList<Integer> list=new ArrayList();
        while(head!=null){
            list.add(head.val);
            head=head.next;
        }
        for(int i=list.size()-2;i>=0;i--){
            if(list.get(i+1)>list.get(i)){
                list.remove(i);
            }
        }
        System.out.println(list.toString());
        head=new ListNode();
        ListNode StoredHead=head;
        int i;
        for(i=0;i<list.size()-1;i++){
            
            head.val=list.get(i);
            System.out.println(head.val);
            head.next=new ListNode();
            head=head.next;
        }
        head.val=list.get(i);
        head=StoredHead;
        return head;  
    }
}