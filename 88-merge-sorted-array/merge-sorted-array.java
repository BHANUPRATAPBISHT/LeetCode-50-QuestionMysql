class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {

        int i = 0;
        int j = 0;
        int k = 0;

        int[] temp = new int[m+n];

        while(i < m && j < n)
        {
            if(nums1[i] <= nums2[j])
            {
                temp[k] = nums1[i];
                i++;
            }
            else
            {
                temp[k] = nums2[j];
                j++;
            }
            k++;
        }

        // remaining nums1 elements
        while(i < m)
        {
            temp[k++] = nums1[i++];
        }

        // remaining nums2 elements
        while(j < n)
        {
            temp[k++] = nums2[j++];
        }

        // copy back to nums1
        for(int x = 0; x < m+n; x++)
        {
            nums1[x] = temp[x];
        }
    }
}