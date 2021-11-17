Q link: https://practice.geeksforgeeks.org/problems/print-1-to-n-without-using-loops3621/1



//User function Template for Java
class Solution{
    static void printTillN(int N){
        
        if(N<=0)
        return;
        
        printTillN(N-1);
        System.out.print(N+" ");
        
         
        
    }
}
