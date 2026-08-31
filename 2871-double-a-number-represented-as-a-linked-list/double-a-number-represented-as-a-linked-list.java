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
    public ListNode doubleIt(ListNode head) {
        // Step 1: Handle the carry at the very front
        // If the first digit is 5 or greater, doubling it will create a carry (e.g., 5 * 2 = 10)
        // This requires creating exactly ONE new head node at the beginning.
        if (head.val >= 5) {
            head = new ListNode(0, head);
        }
        
        ListNode current = head;
        
        // Step 2: Traverse the list and update values in place
        while (current != null) {
            // Double the current value and keep only the last digit (e.g., 7 * 2 = 14 -> 4)
            current.val = (current.val * 2) % 10;
            
            // Look ahead to the NEXT node. 
            // If the next node's value is 5 or greater, it will generate a carry of 1.
            // We must add that carry to our CURRENT node.
            if (current.next != null && current.next.val >= 5) {
                current.val++;
            }
            
            // Move to the next node
            current = current.next;
        }
        
        return head;
    }
}
