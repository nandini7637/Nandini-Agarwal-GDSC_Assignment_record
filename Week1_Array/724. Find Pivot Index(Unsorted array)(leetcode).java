
/*        Q link: https://leetcode.com/problems/find-pivot-index/    */


class Solution {
    public int pivotIndex(int[] nums) {
        
         int sum = nums[0];
        int tsum = 0;
        
        
        if(nums.length==1) // length 1 case
            return nums[0];
        
       else if(nums.length==2 ) // length 2 case
        return -1;
        
        else
        {
      
        for(int i=0;i<nums.length;i++)
        {
            tsum+=nums[i];
        }
        
             if(tsum-nums[0]==0) // if sum of array on right of index 0 is 0, then return index 0 as left is considered to be 0
                return 0; // If the index is on the left edge of the array, then the left sum is 0 because there are no elements to the left
            
        for(int i=1;i<nums.length;i++)
        {
            sum+=nums[i];
            int lsum = sum-nums[i];
            int rsum = tsum-sum;
            if(lsum==rsum)
                return i;
        }
            
        
        }
        return -1;
    }
}
