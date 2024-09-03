//This program prints the addition of two matrix
import java.util.*;
public class MatrixAddition
{
    public static void main(String args[])
    {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter row 1 and column 1 :");
        int r1=obj.nextInt(),c1=obj.nextInt(),i,j;
        int ar1[][]=new int[r1][c1];
        System.out.println("Enter row 2 and column 2 :");
        int r2=obj.nextInt(),c2=obj.nextInt();
        int ar2[][]=new int[r2][c2];
        if(r1==r2 && c1==c2)
        {
            System.out.println("Enter the array1 elements : ");
            for(i=0;i<r1;i++)
                for(j=0;j<c1;j++)
                    ar1[i][j]=obj.nextInt();
            System.out.println("Enter the array2 elements : ");
            for(i=0;i<r2;i++)
                for(j=0;j<c2;j++)
                    ar2[i][j]=obj.nextInt();
            obj.close();
            int ar[][]=new int[r1][c1];
            for(i=0;i<r1;i++)
                for(j=0;j<c1;j++)
                ar[i][j]=ar1[i][j]+ar2[i][j];
            for(i=0;i<r1;i++)
                for(j=0;j<c1;j++)
                    System.out.print(ar[i][j]+" ");
        }
        else
            System.out.println("The row and column size shoud be same");
    }    
}