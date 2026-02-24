class Solution {
    public List<Integer> findDisappearedNumbers(int[] arr) {
        ArrayList<Integer> ans=new ArrayList<>();
        int i=0;
        int n=arr.length;

        while(i<arr.length)
        { 
            int idx=arr[i]-1;
            if(arr[i]==i+1 || arr[idx]==arr[i] ||arr[i]>n)
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
                ans.add(j+1);
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