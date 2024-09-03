// This program prints the following hour glass pattern.
//   * * *
//    * *
//     *
//    * *
//   * * * 
import java.util.*;
public class HourGlass 
{
    public static void main(String args[])   
    {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the no of rows :");
        int n=obj.nextInt(),i,j;
        obj.close();
        for(i=1;i<=n;i++)
        {
            for(j=1;j<i;j++)
                System.out.print(" ");
            for(j=i;j<=n;j++)
                System.out.print("* ");
            System.out.println();
        }
        for(i=2;i<=n;i++)
        {
            for(j=i;j<n;j++)
                System.out.print(" ");
            for(j=1;j<=i;j++)
                System.out.print("* ");
            System.out.println();
        }
    }
}