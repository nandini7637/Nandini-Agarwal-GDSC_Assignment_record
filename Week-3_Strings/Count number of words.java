Q link: https://practice.geeksforgeeks.org/problems/count-number-of-words1500/1#

class Solution 
{ 
    int countWords(String s) 
    { 
        int count=0;
        int pos=0;
      for(int i=0;i<s.length();i++)
    {
        if(s.charAt(i)==' ' || s.charAt(i)=='\n' || s.charAt(i)=='\t') 
       {  
           pos=0;
       }
        else if(pos==0)
        {
            pos=1;
            count++;
        }

        
    }
    
    
    return count;
    }
} 
