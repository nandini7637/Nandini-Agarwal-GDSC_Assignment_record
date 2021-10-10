/* Q link: https://leetcode.com/problems/best-time-to-buy-and-sell-stock/  */


class Solution {
public int maxProfit(int[] arr) {

    int least =0;  // Stores index of smallest value
    int diff=0;
    int j=0;
    for(int i=1;i<arr.length;i++)
    {
        if(arr[i]<arr[least])  // updates least
        {
            least=i;
            continue;
        }
        if(diff<arr[i]-arr[least]) // Compares difference
            diff = arr[i]-arr[least];
    }
    return diff;
}
}
