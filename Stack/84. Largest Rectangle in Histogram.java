class Solution {
    public int largestRectangleArea(int[] heights) {
        
        int l=heights.length;
        Stack<Integer> st = new Stack<>();
        int nsl[]=new int[l];
        int nsr[]=new int[l];
        
        // next smaller element on left
        for(int i=0;i<l;i++)
        {
            while(st.size()!=0 && heights[st.peek()]>=heights[i])
            {
                st.pop();
            }
            
            if(st.size()==0)
                nsl[i]=0;
            else
                nsl[i]=st.peek()+1;
           
            st.push(i);
            
        }
        
        while(st.size()!=0)
            st.pop();
        
        
        // nsr
         for(int i=l-1;i>=0;i--)
        {
            while(st.size()!=0 && heights[st.peek()]>=heights[i])
            {
                st.pop();
            }
            
            if(st.size()==0)
                nsr[i]=l-1;
            else
                nsr[i]=st.peek()-1;
           
            st.push(i);
            
        }
        
        int marea=0;
        for(int i=0;i<l;i++)
        {
            
            marea = Math.max(marea,heights[i]*(nsr[i]-nsl[i]+1));
            
        }
        
            return marea;
        
    }
}
