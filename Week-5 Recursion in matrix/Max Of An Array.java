Q link: https://www.pepcoding.com/resources/online-java-foundation/recursion-in-arrays/max-of-an-array-official/ojquestion

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.println(maxOfArray(arr,1));
        
    }

    public static int maxOfArray(int[] arr, int idx){
        if(idx==arr.length-1)
        {
            return arr[idx];
        }
      
      int max = Math.max(arr[idx],maxOfArray(arr,idx+1));
      return max;
    }

}
