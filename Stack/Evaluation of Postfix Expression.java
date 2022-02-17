class Solution
{
    //Function to evaluate a postfix expression.
    public static int evaluatePostFix(String s)
    {
        Stack<Integer> st = new Stack<>();
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            
            if(s.charAt(i)!='+' && s.charAt(i)!='-' && s.charAt(i)!='*' && s.charAt(i)!='/')
            {
             st.push((int)s.charAt(i)-'0');
             
            }
            else{
                int c2=st.peek();
                st.pop();
                int c1=st.peek();
                st.pop();
                if(ch=='+')
                st.push(c1+c2);
                else if(ch=='-')
                st.push(c1-c2);
                else if(ch=='*')
                st.push(c1*c2);
                else
                st.push(c1/c2);
            }
        }
        return st.peek();
    }
}
