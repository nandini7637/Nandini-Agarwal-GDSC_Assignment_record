Q link: https://leetcode.com/problems/search-a-2d-matrix-ii/



class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        
        int n = 0;
        int m = matrix.length-1;
        
        while(m>=0 && n<matrix[0].length)
        {
            if(target==matrix[m][n])
                return true;
            else if(target>matrix[m][n])
                n++;
            else
                m--;
        }
        
       return false; 
    }
}
