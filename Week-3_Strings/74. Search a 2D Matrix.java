Q link: https://leetcode.com/problems/search-a-2d-matrix/



class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        
       int n = matrix[0].length-1;
        int m = 0;
        while( m<matrix.length && n>=0)
        {
            if(matrix[m][n]==target)
                return true;
            else if(matrix[m][n]>target)
                n--;
            else
                m++;
        }
        return false;
        
    }
}
