class Solution {
    public ListNode swapNodes(ListNode head, int k) {

        // 1️⃣ kth node from start
        ListNode first = head;
        for (int i = 1; i < k; i++) {
            first = first.next;
        }

        // 2️⃣ kth node from end
        ListNode slow = head;
        ListNode fast = first;

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
