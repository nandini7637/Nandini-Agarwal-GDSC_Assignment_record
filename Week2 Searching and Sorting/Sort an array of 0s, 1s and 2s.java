/* Q link: https://practice.geeksforgeeks.org/problems/sort-an-array-of-0s-1s-and-2s4231/1#  **/

Q has to be solved in O(n) time complexity

class Solution
{
    public static void sort012(int a[], int n)
    {
        int zero=0,one=0,two=0;
        for(int i=0;i<n;i++)
        {
           if(a[i]==0)
           zero++;
           else if(a[i]==1)
           one++;
           else
           two++;
           
        }
        int p=0;
        for(int i=0;i<zero;i++)
        {a[p++]=0;}
        for(int i=0;i<one;i++)
       { a[p++]=1;}
        for(int i=0;i<two;i++)
        {a[p++]=2;}
    }
}
