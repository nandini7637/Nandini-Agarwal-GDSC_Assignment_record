q link: https://practice.geeksforgeeks.org/problems/count-all-possible-paths-from-top-left-to-bottom-right3011/1

class Solution
{
    long numberOfPaths(int m, int n)
    {
    
    if(n==1 | m==1)
    return 1;
  
    
    
    return(numberOfPaths(m-1,n)+numberOfPaths(m,n-1));
    
    
    }
}
