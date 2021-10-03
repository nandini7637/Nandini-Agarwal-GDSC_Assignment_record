class Solution
{
    // Complete the function
    public static int immediateSmaller(int arr[], int n, int x)
    {
        Arrays.sort(arr);
        if(x<=arr[0])
        return -1;
        
        int low =0;
        int high = n-1;
        int ans =-1;
        while(low<=high)
        {
         int mid = low + (high-low)/2;
         if(arr[mid]==x)
         { ans = arr[mid-1]; // In case duplicates are present
           high = mid-1;
         }
         else if(arr[mid]>x)
         high = mid-1;
         else
         low = mid+1;
        }
        return arr[high];
    }
}
