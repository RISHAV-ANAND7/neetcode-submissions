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
    public boolean hasCycle(ListNode head) {
if(head==null ||head.next==null) return false;

        ListNode temp1=head;
        ListNode temp2=head;
        while(temp1!=null && temp1.next!=null){
            temp1=temp1.next.next;
            temp2=temp2.next;
        
        if(temp2==temp1){
        return true;
        }
        }
        return false;
    }
}
