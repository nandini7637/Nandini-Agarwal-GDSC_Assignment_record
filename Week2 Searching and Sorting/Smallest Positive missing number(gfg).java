/* Q link: https://practice.geeksforgeeks.org/problems/smallest-positive-missing-number3051/1/#  */

class Solution{
    
    // Function to find 
    static int findMissing(int arr[], int size)
    {
       
       Arrays.sort(arr);
       if(arr.length==1)
       return 1;
       
       for(int i=1;i<arr.length;i++)
       {
           
           if(arr[i]!=(arr[i-1]+1) && arr[i]!=arr[i-1])
           {
               if(arr[i-1]<0 && arr[i]>1 && arr[i]!=0)
               return 1;
              
        else if(arr[i-1]+1>0)
               {
           return (arr[i-1]+1);
               }
             
       }
       
       
    }
    if(arr[arr.length-1]>0)
    return (arr[arr.length-1]+1);
    else 
    return 1;
}
}
