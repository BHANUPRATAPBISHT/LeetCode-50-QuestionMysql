class Solution {

    public boolean isPalindrome(ListNode head) {

        if (head == null || head.next == null)
            return true;

        // 1. find middle (end of first half)
        ListNode slow = head;
        ListNode fast = head;

        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // 2. split list
        ListNode head2 = slow.next;
        slow.next = null;

        // 3. reverse second half
        head2 = reverse(head2);

        // 4. compare both halves
        ListNode p1 = head;
        ListNode p2 = head2;

        while (p2 != null) {
            if (p1.val != p2.val)
                return false;
            p1 = p1.next;
            p2 = p2.next;
        }

        return true;
    }

    // reverse linked list (MUST be inside class)
    public ListNode reverse(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;

        while (curr != null) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
}
