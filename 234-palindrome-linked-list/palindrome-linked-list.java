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
    public boolean isPalindrome(ListNode head) {
        try{
        ArrayList<Integer> arr=new ArrayList<>();
        while(head.next!=null){
            arr.add(head.val);
            head=head.next;
        }
        arr.add(head.val);
        int i=0;
        int j=arr.size()-1;
        while(i<j){
            if(arr.get(i)==arr.get(j)){
                i++;
                j--;    
            }else{
                return false;
            }
        }
        return true;
        }catch(Exception E){
            return true;
        }
    }
}