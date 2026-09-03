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
    public ListNode[] splitListToParts(ListNode head, int k) {
        ListNode StoredHead=head;
        int size=0;
        while(head!=null){
            head=head.next;
            size++;
        }
        head=StoredHead;
        ListNode[] ans=new ListNode[k];
        int i=0;
        if(size<=k){
            while(head!=null){
                ListNode temp=new ListNode();
                temp.val=head.val;
                temp.next=null;
                ans[i]=temp;
                head=head.next;
                i++;
            }
            while(i<k){
                ans[i]=null;
                i++;
            }
            return  ans;
        }else{
            head=StoredHead;
            int base = size / k;
            int extra = size % k;
            i=0;
            int count=0;
            while(i<k){
                ListNode temp=new ListNode();
                ans[i]=temp;
                count=0;
                while(count<base){
                    temp.val=head.val;
                    temp.next=new ListNode();
                    temp=temp.next;
                    head=head.next;
                    count++;
                }
                if(extra>0){
                    temp.val=head.val;
                    temp.next=new ListNode();
                    temp=temp.next;
                    head=head.next;
                    count++;
                    extra--;
                }
                i++;
            }
            for(i=0;i<ans.length;i++){
                ListNode t=ans[i];
                while(t.next.next!=null){
                    t=t.next;
                }
                t.next=null;
            }
        
}
return ans;
}
}