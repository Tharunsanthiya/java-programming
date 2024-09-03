// This program prints the Sum of sum-series of first N Natural numbers....
import java.util.*;
public class SumOfSeries
{
    public static void main(String args[])
    {
        Scanner obj=new Scanner(System.in);
        System.out.print("Enter the number to print the sum : \n");
        int n=obj.nextInt(),s=0,i;
        obj.close();
        for(i=1;i<=n;i++)
            s+=i;
        System.out.println("The series sum of "+n+" is "+s);
    }   
}