//This program prints the fibonacci series of a given number
import java.util.*;
public class FibonacciSeries 
{
    public static void main(String args[])
    {
        Scanner obj=new Scanner(System.in);
        System.out.print("Enter the number to print the fibonacci series : \n");
        int n=obj.nextInt(),a=0,b=1,c=1;
        obj.close();
        for(int i=1;i<=n;i++)
        {
            System.out.print(a+" ");
            a=b;
            b=c;
            c=a+b;
        }
    }    
}
