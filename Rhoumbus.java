// This program prints the following Rhombus
// * * * * 
//  * * * * 
//   * * * * 
//    * * * * 
import java.util.*;
public class Rhoumbus 
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
            for(j=1;j<=n;j++)
                System.out.print("* ");
            System.out.println();
        }
    }
}