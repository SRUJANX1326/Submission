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
    public ListNode mergeList(ListNode one, ListNode two) {
        if(one ==null) return two;
        if(two==null) return one;
        ListNode temp = new ListNode();
        ListNode StoredHead = temp;
        while (one != null && two != null) {
            if (one.val <= two.val) {
                temp.val = one.val;
                one = one.next;
            } else {
                temp.val = two.val;
                two = two.next;
            }
            temp.next=new ListNode();
            temp=temp.next;
        }
        while (one != null) {
            temp.val = one.val;
            one = one.next;
            temp.next=new ListNode();
            temp=temp.next;
        }
        while (two != null) {
            temp.val = two.val;
            two = two.next;
            temp.next=new ListNode();
            temp=temp.next;
        }
        temp = StoredHead;
        while(temp.next.next!=null){
            temp=temp.next;
        }
        temp.next=null;
        System.out.println(temp.val);
        return StoredHead;
    }

    public ListNode mergeKLists(ListNode[] lists) {
        if (lists.length==0 )
            return null;
        ListNode ans=null;
        for (int i = 0; i < lists.length; i++) {
            ans=mergeList(ans,lists[i]);
        }

        return ans;
    }
}