
class Solution{
    //Function to find the leaders in the array.
    static ArrayList<Integer> leaders(int arr[], int n){
        
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(arr[arr.length-1]);
       int greatest = arr[arr.length-1];
        for(int i=arr.length-2;i>=0;i--)
        {
            
            if(arr[i]>=greatest)
            {
                greatest = arr[i];
                list.add(arr[i]);
            }
            
            
        }
        Collections.reverse(list);
        return list;
        
    }
}
