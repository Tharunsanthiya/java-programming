//Thos program checks whether a given string is palindrome or not excluding cases....
import java.util.*;
public class StringPalindrome 
{
    public static void main(String args[])
    {
        Scanner obj=new Scanner(System.in);
        String s=obj.nextLine().toLowerCase(),st="";
        obj.close();
        for(int i=s.length()-1;i>=0;i--)
            st+=s.charAt(i);
        if(st.equals(s))
            System.out.println(s+" is a palindrome String");
        else
            System.out.println(s+" is not a palindrome String");
   }
}
