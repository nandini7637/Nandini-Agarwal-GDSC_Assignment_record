/* Q link: https://leetcode.com/problems/maximum-subarray/  */

This q is done using Kadane's Algorithm
  
  class Solution {
    public int maxSubArray(int[] nums) {
        
        int csum = nums[0];  // current sum
        int osum = nums[0];  // overall sum
        
        for(int i=1;i<nums.length;i++)
        {
            if(csum>=0)        // If previous sum is +ve, it adds to it
                csum+=nums[i];
            else{               // If previous sum is negative, it creates it's own chain
                csum=nums[i];
            }
            
            if(csum>osum)    // if current sum is > osum, osum updates
                osum=csum;
            
        }
        
        return osum;
    }
}
