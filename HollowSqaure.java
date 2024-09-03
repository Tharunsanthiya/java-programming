// // This program prints the following hollow sqaure pattern.
// * * * * *
// *       *
// *       *
// *       * 
// * * * * *
import java.util.*;
public class HollowSqaure 
{
    public static void main(String args[])
    {
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt(),i,j;
        obj.close();
        for(i=1;i<=n;i++)
        {
            for(j=1;j<=n;j++)
            {
                if(i==1||i==n)
                    System.out.print("* ");
                else if(j==1 || j==n)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }   
}