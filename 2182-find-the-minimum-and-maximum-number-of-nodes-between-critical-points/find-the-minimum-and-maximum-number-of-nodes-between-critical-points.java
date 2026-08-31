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
    public int[] nodesBetweenCriticalPoints(ListNode head) {

        if (head.next.next == null) {
            return new int[] { -1, -1 };
        }

        ListNode prev = head;
        ListNode curr = head.next;

        int minDistance = Integer.MAX_VALUE;
        int maxDistance = Integer.MIN_VALUE;
        int first = -1;
        int last = -1;
        int count = 2;
        while (curr.next != null) {
            if ((prev.val < curr.val && curr.val > curr.next.val) || (prev.val > curr.val && curr.val < curr.next.val)) {
                if (last != -1) {
                    minDistance = Math.min(minDistance, count - last);
                } else {
                    first = count;
                }
                last = count;
            }
            count++;
            prev = curr;
            curr = curr.next;
        }

        maxDistance = Math.max(maxDistance, last - first);

        if (first == last)
            return new int[] { -1, -1 };

        return new int[] { minDistance, maxDistance };
    }
}