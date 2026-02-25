class Solution {
    public int findDuplicate(int[] arr) {
        int i=0;
        int n=arr.length-1;
        while(i<arr.length)
        {
            int idx=arr[i]-1;
            if(arr[i]==i+1 || arr[idx]==arr[i]  )
            
            {
                i++;
            }
            else
            {
                swap(arr,idx,i);
            }
        }
        for(int j=0;j<arr.length;j++)
        {
            if(arr[j]!=j+1)
            {
                return arr[j];
            }
        }
        return n;
    }
    public static void swap(int arr[],int idx,int i)
    {
        int temp=arr[i];
        arr[i]=arr[idx];
        arr[idx]=temp;

    }
}