class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        ListNode one = list1;
        ListNode two = list2;

        ListNode dummy = new ListNode(-1); // dummy node
        ListNode curr = dummy;             // moving pointer

        while (one != null && two != null) {
            if (one.val <= two.val) {
                curr.next = one;
                one = one.next;
            } else {
                curr.next = two;
                two = two.next;
            }
            curr = curr.next; // move curr
        }

        // attach remaining list
        if (one != null) {
            curr.next = one;
        } else {
            curr.next = two;
        }

        return dummy.next; // real head
    }
}
