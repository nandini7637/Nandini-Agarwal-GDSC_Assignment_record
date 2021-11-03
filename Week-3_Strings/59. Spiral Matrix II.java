Q link: https://leetcode.com/problems/spiral-matrix-ii/


class Solution {
    public int[][] generateMatrix(int n) {
        
        
        int[][] arr = new int[n][n];
        if(n==1)
        {
            arr[0][0]=1;
            return arr;
        }
        int elem =1;
        int total = n*n;
        int minr=0;
        int maxr=n-1;
        int minc=0;
        int maxc=n-1;
        
        while(elem<=total)
        {
            // top wall
            for(int i=minc,j=minr;i<=maxc && elem<=total ;i++)
            {
                arr[j][i]=elem;
                elem++;
            }
            minr++;
            
            // right wall
            for(int i=minr,j=maxc;i<=maxr && elem<=total;i++)
            {
                arr[i][j]=elem;
                elem++;
            }
            maxc--;
            // bottom wall
            for(int i=maxc,j=maxr;i>=minc && elem<=total;i--)
            {
                arr[j][i]=elem;
                elem++;
            }
            maxr--;
            // left wall
            for(int i=maxr,j=minc;i>=minr && elem<=total;i--)
            {
                arr[i][j]=elem;
                elem++;
            }
            minc++;
        }
        return arr;
    }
}
