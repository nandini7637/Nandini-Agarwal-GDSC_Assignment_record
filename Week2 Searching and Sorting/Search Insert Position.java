/*  Q link: https://leetcode.com/problems/search-insert-position/   */

class Solution {
    public int searchInsert(int[] nums, int target) {
        
        int low=0;
        int high = nums.length-1;
        
        if(target>nums[high]) // edge cases
            return high+1;
        else if (target<nums[low])
            return 0;
        
        while(low<=high)
        {
            int mid = low+(high-low)/2;
            if(nums[mid]==target)
                return mid;
            else if(nums[mid]>target)
                high = mid-1;
            else
                low=mid+1;
            
        }
        
        return high+1;
        
        
    }
}
