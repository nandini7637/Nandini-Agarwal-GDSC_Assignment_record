Q link: https://leetcode.com/problems/power-of-two/


class Solution {
    public boolean isPowerOfTwo(int n) {
        
        
        if(n<=0)                 // Solution 1 using recursion
            return false;
     if(n==1)
            return true;
        if (n%2==1)
            return false;
        
       return( isPowerOfTwo(n/2));
        
      
      
      
        
        if(n<=0)                       // Solution 2 using BIT Manipuation
            return false;               
        
        return( (n &(n-1))==0);
        
        // Explaination
  /*    *   0   0000   0111    0000 *
      *   1   0001   0000    0000 *
      *   2   0010   0001    0000 *
        	3   0011   0010    0010
      *   4   0100   0011    0000 *
        	5   0101   0100    0100
	        6   0110   0101    0100
	        7   0111   0110    0110
      *   8   1000   0111    0000 *
        	9   1001   1000    1000      */
        
    }
}

