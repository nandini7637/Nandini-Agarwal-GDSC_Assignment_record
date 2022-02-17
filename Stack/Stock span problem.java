class Solution
{
    //Function to calculate the span of stockâ€™s price for all n days.
    public static int[] calculateSpan(int price[], int n)
    {
        // nge on left
        Stack<Integer> st = new Stack<>();
        int[] arr = new int[n];
        int ans[] = new int[n];
        arr[0]=-1;
        ans[0]=1;
        st.push(0);
        for(int i=1;i<n;i++)
        {
            while(st.size()!=0 && price[st.peek()]<=price[i])
            st.pop();
            
            if(st.size()==0)
            {
            arr[i]=-1;
            }
            else
            {
                arr[i]=st.peek();
               
            }
             st.push(i);
        }
        
        for(int i=1;i<n;i++)
        {
            ans[i]=i-arr[i];
        }
     
     return ans;   
    }
    
}
