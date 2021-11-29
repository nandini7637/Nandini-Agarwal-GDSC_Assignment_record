Q link: https://www.pepcoding.com/resources/online-java-foundation/recursion-in-arrays/all-indices-official/ojquestion


import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        int x = Integer.parseInt(br.readLine());
        int[] iarr = allIndices(arr, x, 0, 0);

        if(iarr.length == 0){
            System.out.println();
            return;
        }

        for(int i = 0; i < iarr.length; i++){
            System.out.println(iarr[i]);
        }
    }
  
  
  // Main code starts from here
  
    public static int[] allIndices(int[] arr, int x, int idx, int fsf) {
        
        if(arr.length==idx)
        return new int[fsf];
        
        
        if(arr[idx]==x)
        {
         int[] a =  allIndices(arr, x, idx+1, fsf+1);
         a[fsf] = idx;
         return a;
            
        }
        
        else
        {
           int[] a = allIndices(arr, x, idx+1, fsf); 
           return a;
        }
        
    }

}
