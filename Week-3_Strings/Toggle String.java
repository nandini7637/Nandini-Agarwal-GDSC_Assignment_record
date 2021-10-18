Q link: https://www.hackerearth.com/practice/basic-programming/input-output/basics-of-input-output/practice-problems/algorithm/modify-the-string/



import java.util.*;

class TestClass {
    public static void main(String args[] ) throws Exception {
    

        Scanner s = new Scanner(System.in);
        String name = s.nextLine();              
      
      StringBuilder str = new StringBuilder();

        for(int i=0;i<name.length();i++)
        {
          if(name.charAt(i)>='a' && name.charAt(i)<='z')
          str.append((char)(name.charAt(i)-'a'+'A'));
          else
          str.append((char)(name.charAt(i)+'a'-'A'));

        }
        System.out.println(str.toString());

    }
}
