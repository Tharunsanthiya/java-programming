//This program prints the factorial of a number
import java.util.*;
public class factorial
{
    public static void main(String args[])
    {
        Scanner obj= new Scanner(System.in);
        System.out.println("Enter a number to print factorial :");
        int n=obj.nextInt(),f=1;
        obj.close();
        for(int i=1;i<=n;i++)
        {
            f=f*i;
        }
        System.out.println(f+" is the factorial of "+n);
    }    
}
