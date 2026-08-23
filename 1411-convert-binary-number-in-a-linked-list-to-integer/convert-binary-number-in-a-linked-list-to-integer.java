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
    public int getDecimalValue(ListNode head) {
        ArrayList<Integer> AL=new ArrayList<>();
        while(head!=null){
            AL.add(head.val);
            head=head.next;
        }
        int sum=0;
        for(int i=0;i<AL.size();i++){
            sum=sum+(int)Math.pow(2,i)*AL.get(AL.size()-i-1);
        }
        return sum;
    }
}