/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		    Scanner sc = new Scanner(System.in);
		    int T = sc.nextInt();
		    for(int i=1;i<=T;i++)
		    {
		        int N = sc.nextInt();
		        int[] arr = new int[N];
		        for(int j=0;j<N;j++)
		        {
		             arr[j] = sc.nextInt();
		        }
		        for(int j=0;j<N/2;j++)
		        {
		            int temp = arr[N-1-j];
		             arr[N-1-j] = arr[j];
		            arr[j] = temp;
		        }
		        for(int j=0;j<N;j++)
		        {
		             System.out.print(arr[j]+" ");
		             
		        }
		        System.out.println();
		    }
	}
}
