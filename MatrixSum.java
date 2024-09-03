//This program prints the sum of an matrix
import java.util.*;
public class MatrixSum
{
    public static void main(String args[])
    {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter row and column :");
        int r=obj.nextInt(),c=obj.nextInt(),i,j,s=0;
        int ar[][]=new int[r][c];
        System.out.println("Enter the array elements : ");
        for(i=0;i<r;i++)
        {
            for(j=0;j<c;j++)
            {    
                ar[i][j]=obj.nextInt();
                s+=ar[i][j];
            }
        }
        System.out.println("The Matrix sum is : "+s);
    }    
}