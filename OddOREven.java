//This program checks whether the number is ODD or EVEN.
import java.util.*;
public class OddOREven 
{
    public static void main(String args[])
    {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the number :");
        int n=obj.nextInt();obj.close();
        if(n%2==0)
            System.out.println(n+" is even number..");
        else
            System.out.println(n+" is odd number..");
    }   
}