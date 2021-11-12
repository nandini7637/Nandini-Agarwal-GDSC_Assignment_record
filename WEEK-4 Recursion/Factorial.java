Q link: https://practice.geeksforgeeks.org/problems/factorial5739/1#



class Solution{
    static long factorial(int N){
        
        if(N<2)
        return 1;
        
       return (N*factorial(N-1));
       
    }
}
