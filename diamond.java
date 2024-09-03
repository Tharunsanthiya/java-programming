// This program prints the following diamond pattern
//    *
//   ***
//  *****
// *******
//  *****
//   ***
//    *
import java.util.*;
public class diamond
{
    public static void main(String args[])
    {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the no of rows :");
        int n=obj.nextInt(),i,j;
        for(i=0;i<n;i++)
        {
            for(j=i+1;j<n;j++)
            {
                System.out.print(" ");
            }
            for(j=0;j<=i;j++)
            {
                System.out.print("*");
            }
            for(j=0;j<i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        for(i=0;i<n;i++)
        {
            for(j=0;j<=i;j++)
            {
                System.out.print(" ");
            }
            for(j=i+1;j<n;j++)
            {
                System.out.print("*");
            }
            for(j=i+1;j<n-1;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}