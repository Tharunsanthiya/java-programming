// This program prints the following inverted right half pyramid pattern
// * * * * * * 
// * * * * * 
// * * * * 
// * * * 
// * * 
// * 
import java.util.*;
public class InvertedRightPyramid
{
 public static void main(String args[])
 {
    Scanner obj=new Scanner(System.in);
    System.out.println("Enter the no.of times:");
    int i,j,n=obj.nextInt();
    for(i=n;i>=0;i--)
    {
        for(j=0;j<=i;j++)
        {
            System.out.print("*"+" ");
        }
        System.out.println();
    }
 }   
}