class Solution {
    public void moveZeroes(int[] nums) {

        for(int i=0;i<nums.length-1;i++)
        {
            boolean swap=false;
            for(int j=0;j<nums.length-1-i;j++)
            {
                if(nums[j]==0 && nums[j+1]!=0)
                {
                    int temp=nums[j];
                    nums[j]=nums[j+1];
                    nums[j+1]=temp;
                    swap=true;
                }
            }
            if(swap==false)
            {
                break;
            }
        }
        
        
    }
}