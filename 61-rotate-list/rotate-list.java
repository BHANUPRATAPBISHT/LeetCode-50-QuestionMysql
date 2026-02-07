class Solution {

    // Function to find length of linked list
    public int length(ListNode head) {
        int count = 0;
        ListNode temp = head;

        while (temp != null) {
            count++;
            temp = temp.next;
        }
        return count;
    }

    public ListNode rotateRight(ListNode head, int k) {

        // Edge cases
        if (head == null || head.next == null) {
            return head;
        }

        int n = length(head);
        k = k % n;

        // If no rotation needed
        if (k == 0) {
            return head;
        }

        ListNode slow = head;
        ListNode fast = head;

        // Move fast k steps ahead
        for (int i = 1; i <= k; i++) {
            fast = fast.next;
        }

        // Move both pointers
        while (fast.next != null) {
            slow = slow.next;
            fast = fast.next;
        }

        // Rotation
        ListNode newHead = slow.next;
        slow.next = null;
        fast.next = head;

        return newHead;
    }
}
