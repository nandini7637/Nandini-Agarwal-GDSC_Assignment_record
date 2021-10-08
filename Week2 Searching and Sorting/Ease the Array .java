/* Q link: https://practice.geeksforgeeks.org/problems/ease-the-array0633/1/?category[]=Arrays&category[]=Arrays&difficulty[]=0&page=3&query=category[]Arraysdifficulty[]0page3category[]Arrays#  */

Q has to be done in O(n) time complexity

class Solution{
    void modifyAndRearrangeArr (int a[], int n) {
        
        for(int i=0;i<n-1;i++) // loop modifing numbers
        {
            
            if(a[i]==a[i+1] && a[i+1]!=0)
            {
                a[i]=2*a[i];
                a[i+1]=0;
                
            }
            
        }
        
        int p=0;
        for(int j=0;j<n;j++) // loop placing non-zero numbers in original order 
        {
            if(a[j]!=0)
            {
                a[p]=a[j];
                p++;
            }
        }
        
        for(int i=p;i<n;i++) // loop placing 0s at end
        {
            a[i]=0;
        }
        
    }
}
