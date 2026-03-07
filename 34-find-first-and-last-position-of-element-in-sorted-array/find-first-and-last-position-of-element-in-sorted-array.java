class Solution {
    public int[] searchRange(int[] nums, int target) {

        int first = -1, last = -1;

        // ---------- Find first occurrence ----------
        int l = 0, r = nums.length - 1;

        while (l <= r) {
            int mid = (l + r) / 2;

            if (nums[mid] > target) {
                r = mid - 1;
            } 
            else if (nums[mid] < target) {
                l = mid + 1;
            } 
            else {
                first = mid;
                r = mid - 1;   // move left
            }
        }

        // ---------- Find last occurrence ----------
        l = 0;
        r = nums.length - 1;

        while (l <= r) {
            int mid = (l + r) / 2;

            if (nums[mid] > target) {
                r = mid - 1;
            } 
            else if (nums[mid] < target) {
                l = mid + 1;
            } 
            else {
                last = mid;
                l = mid + 1;   // move right
            }
        }

        return new int[]{first, last};
    }
}
