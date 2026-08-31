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
    public int pairSum(ListNode head) {
        ArrayList<Integer> list=new ArrayList();
        while(head!=null){
            list.add(head.val);
            head=head.next;
        }
        int i=0;
        int j=list.size()-1;
        int sum=0;
        while(i<j){
            int temp=list.get(i)+list.get(j);
            if(temp>sum){
                sum=temp;
            }
            i++;
            j--;
        }
        return sum;
    }
}