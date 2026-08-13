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
    public ListNode swapPairs(ListNode head) {
        ListNode ptr = head;

        if(head==null || head.next==null){
            return head;
        }
        
        ListNode newHead = head.next;
        ListNode prev = null;
        while(ptr!=null && ptr.next!=null){
            ListNode temp = ptr.next;
            ListNode remaining = temp.next;
            temp.next = ptr;
            ptr.next = remaining;
                if (prev != null) {
                prev.next = temp;
            }

            prev = ptr;
            ptr=remaining;
        }
        return newHead;
    }
}