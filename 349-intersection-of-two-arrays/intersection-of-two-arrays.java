import java.util.*;

class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {

        // Step 1: Sort both arrays
        Arrays.sort(nums1);
        Arrays.sort(nums2);

        int i = 0, j = 0;
        List<Integer> ans = new ArrayList<>();

        // Step 2: Two-pointer intersection (unique)
        while (i < nums1.length && j < nums2.length) {

            if (nums1[i] == nums2[j]) {

                // Add only if not duplicate
                if (ans.isEmpty() || ans.get(ans.size() - 1) != nums1[i]) {
                    ans.add(nums1[i]);
                }

                i++;
                j++;
            }
            else if (nums1[i] < nums2[j]) {
                i++;
            }
            else {
                j++;
            }
        }

        // Step 3: Convert List -> int[]
        int[] result = new int[ans.size()];
        for (int k = 0; k < ans.size(); k++) {
            result[k] = ans.get(k);
        }

        return result;
    }
}
