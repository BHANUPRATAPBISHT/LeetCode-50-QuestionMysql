class Solution {
    public ListNode swapNodes(ListNode head, int k) {

        ListNode first = head;

        // 1️⃣ move to kth node from start
        for (int i = 1; i < k; i++) {
            first = first.next;
        }

        ListNode slow = head;
        ListNode fast = first;

        // 2️⃣ move fast to end
        while (fast.next != null) {
            slow = slow.next;
            fast = fast.next;
        }

        // 3️⃣ swap values
        int temp = first.val;
        first.val = slow.val;
        slow.val = temp;

        return head;
    }
}
