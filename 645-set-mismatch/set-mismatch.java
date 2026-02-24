class Solution {
    public int[] findErrorNums(int[] arr) {
        int[] ans=new int[2];
        int i=0;
        int n=arr.length;
        while(i<arr.length)
        {
             int idx=arr[i]-1;
            if(arr[i]==i+1 ||  arr[i]==arr[idx])
            {
                i++;
            }
            else
            {
             
                swap(arr,idx,i);
            }
        }
       for (int j = 0; j < n; j++) {
            if (arr[j] != j + 1) {
                ans[0] = arr[j];     // duplicate
                ans[1] = j + 1;      // missing
            }
        }
        return ans;
    }
    public static void swap(int arr[],int idx,int i)
    {
        int temp=arr[i];
        arr[i]=arr[idx];
        arr[idx]=temp;
    }
        
    
}