class Solution {
    public int singleNonDuplicate(int[] nums) {
        int n=nums.length;
        // base case


        if(n==1) return nums[0];
        if(nums[0]!=nums[1]) return nums[0];
        if(nums[n-1]!=nums[n-2]) return nums[n-1];

        // actual coder


        
        int l=0;
        int r=nums.length-1;
        
        while( l<=r)
        {
            int mid=(l+r)/2;
            if(nums[mid]!= nums[mid-1] && nums[mid] != nums[mid+1])
            {
                return nums[mid];
            }

            int p=mid,p2=mid;
            if(nums[mid] == nums[mid-1])
            {
                p=mid-1;
            }
            else
            {
                p2=mid+1;
            }
            int leftDis=p-l;
            int righDis=r-p2;

            if(leftDis % 2==0) // left dis is even go right
            {
                l=p2+1;
            }
            else // else left
            {
                r=p-1;
            }

        }
        return 1;
        
    }
}