// This program prints the following pyramid pattern
//     * 
//    * * 
//   * * * 
//  * * * * 
// * * * * * 
import java.util.*;
public class Pyramid 
{
    public static void main(String args[])
    {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the number of rows :");
        int n=obj.nextInt(),i,j;
        for(i=1;i<=n;i++)
        {
            for(j=i;j<n;j++)
                System.out.print(" ");
            for(j=1;j<=i;j++)
                System.out.print("*"+" ");
            System.out.println();
        }

    }
    
}