Q link: https://practice.geeksforgeeks.org/problems/maximum-occuring-character-1587115620/1#


class Solution
{
    //Function to find the maximum occurring character in a string.
    public static char getMaxOccuringChar(String line)
    { 
        int[] arr = new int[26];
        for(int i=0;i<line.length();i++)
        {
            arr[line.charAt(i)-'a']++;
        }
        int max=0;
        char ch='a';
        for(int i=0;i<26;i++)
        {
            if(arr[i]>max)
           { ch = (char)('a'+i);
           max = arr[i];
           }
        }
        return ch;
    }
    
}
