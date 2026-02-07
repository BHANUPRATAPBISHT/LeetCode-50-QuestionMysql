class Solution {
    public ListNode deleteDuplicates(ListNode head) {

        if (head == null) return null;

        ListNode i = head;
        ListNode j = head.next;

        while (j != null) {
            if (i.val == j.val) {
                j = j.next;
            } else {
                i.next = j;
                i = j;
                
            }
        }

        // Important: cut off remaining duplicates
        i.next = null;

        return head;
    }
}
