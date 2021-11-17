Q link: https://leetcode.com/problems/reverse-string/


class Solution {
    public void reverseString(char[] s) {
        
        int i=0;
        reversesString(s,i);
     
    }
    
      public void reversesString(char[] s , int i)
      {        
          
       char temp=s[s.length-1-i];
          s[s.length-1-i]=s[i];
          s[i]=temp;
        
             i++;
          if(i>=s.length/2)
              return;
           reversesString(s,i);
            }
    
}
