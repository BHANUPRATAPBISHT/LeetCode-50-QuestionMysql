class Solution {
    public int[] nextGreaterElements(int[] arr) {
       int n = arr.length;
        int[] nge = new int[n];
        Stack<Integer> st = new Stack<>();

        // Last element has no next greater
        for( int i=n-1;i>=0;i--)
        {
            st.push(arr[i]);
        }
     

        // Traverse from right to left
        for (int i = n - 1; i >= 0; i--) {

            // Remove smaller elements
            while (!st.isEmpty() && st.peek() <= arr[i]) {
                st.pop();
            }

            // Set answer
            if (st.isEmpty()) {
                nge[i] = -1;
            } else {
                nge[i] = st.peek();
            }

            // Push current element
            st.push(arr[i]);
        }

        return nge;
    }
}
