// This program implents the bubble sort algorithm  to sort a given array....
import java.util.*;
public class BubbleSort
{
    public static void main(String ars[])
    {
        Scanner obj=new Scanner(System.in);
        System.out.print("Enter the array size :");
        int n=obj.nextInt(),i,j,temp=0;
        int ar[]=new int[n];
        System.out.println("Enter array elements :");
        for(i=0;i<n;i++)
        {
            ar[i]=obj.nextInt();
        }
        System.out.println("Before Sorting.");
        for(i=0;i<n;i++)
        {
            System.out.print(ar[i]+" ");
        }
        System.out.println();
        System.out.println("After sorting ");
        for(i=0;i<n;i++)
        {
            for(j=1;j<(n-i);j++)
            {
                if(ar[j-1]>ar[j])
                {
                    temp=ar[j];
                    ar[j]=ar[j-1];
                    ar[j-1]=temp;
                }
            }
        }     
        for(i=0;i<n;i++)
        {
            System.out.print(ar[i]+" ");
        }
    }   
}
