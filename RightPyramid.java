// This program prints the following right half pyramid pattern
// * 
// * * 
// * * * 
// * * * * 
// * * * * * 
import java.util.*; 
public class RightPyramid
{
    public static void main(String args[])
    {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the no.of time :");
        int i,j,n=obj.nextInt();
        for(i=0;i<n;i++)
        {
            for(j=0;j<=i;j++)
            {
                System.out.print("*"+" ");
            }
            System.out.println();
        }
        
    }
}