
/* Q link: https://practice.geeksforgeeks.org/problems/rotate-array-by-n-elements-1587115621/1/?category[]=Arrays&category[]=Arrays&difficulty[]=0&page=1&query=category[]Arraysdifficulty[]0page1category[]Arrays */


class Solution
{
    //Function to rotate an array by d elements in counter-clockwise direction. 
    static void rotateArr(int arr[], int d, int n)
    {
        reverse(arr,0,d-1);
        reverse(arr,d,n-1);
        reverse(arr,0,n-1);
    }
    
    static void reverse(int arr[], int f, int l)
    {
        int fi = f;
        int li = l;
        while(fi<li)
        {
            int temp = arr[fi];
            arr[fi] = arr[li];
            arr[li] = temp;
            li--;
            fi++;
        }
    }
}
