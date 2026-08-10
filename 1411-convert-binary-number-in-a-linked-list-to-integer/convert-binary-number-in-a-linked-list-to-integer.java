class Solution {
    public int getDecimalValue(ListNode head) {
        StringBuilder sb = new StringBuilder();
        ListNode current = head;
        
        while (current != null) {
            sb.append(current.val);
            current = current.next;
        }
        
        return Integer.parseInt(sb.toString(), 2);
    }
}
