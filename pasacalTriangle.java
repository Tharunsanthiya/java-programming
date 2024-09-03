// This program prints the pascal triangle for the number of inputs we give
import java.util.*;
public class pasacalTriangle
{
    public static void main(String args[])
    {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the Number of Rows :");
        int i,j,space=1,row=obj.nextInt(),coeff=0;
        for(i=0;i<row;i++)
        {
            for(space=1;space<  row-i;space++)
            {
                System.out.print("  ");
            }
            for(j=0;j<=i;j++)
            {
                if(j==0||i==0)
                {
                    coeff=1;
                }
                else
                {
                    coeff=coeff*(i-j+1)/j;
                }
                System.out.printf("%4d",coeff);
            }
            System.out.println();   
        }
    }
}