//This program can reverse a string without using any build in functions....
import java.util.*;
public class StringRev
{
    public static void main(String args[])
    {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter a String to reverse :");
        String s=obj.nextLine(),st="";
        obj.close();
        for(int i=s.length()-1;i>=0;i--)
        {
            st+=s.charAt(i);
        }
        System.out.println(st);
    }
}