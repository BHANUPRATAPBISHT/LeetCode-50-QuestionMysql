class Solution {
    public int removeDuplicates(int[] nums) {
        int numsLen = nums.length;
        int k = 1;
        for(int i = 1; i < numsLen; i++) {
            if(nums[i] != nums[i - 1]) {
                nums[k++] = nums[i];
            }
        }
        return k;
    }
}