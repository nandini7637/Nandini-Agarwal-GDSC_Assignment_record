Q link: https://practice.geeksforgeeks.org/problems/palindrome0746/1#



class Solution
{
    public String is_palindrome(int str)
    {
        String n = Integer.toString(str);
        int a = n.length()-1;
        
      if (check(n,a,0)==true)
      return "Yes";
      else
      return "No";
    }
    
    
    public boolean check(String n, int a, int b)
    {
        
        if(a<=b)
        return true;
        if(n.charAt(a)!=n.charAt(b))
        return false;
       
      return(check(n,a-1,b+1));
        
        
        
    }
}
