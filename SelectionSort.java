import java.util.*;
public class SelectionSort
{
    public static void main(String args[])
    {
        Scanner obj=new Scanner(System.in);
        System.out.print("Enter the array size :");
        int n=obj.nextInt(),i,j,temp,index;
        int ar[]=new int[n];
        System.out.print("Enter the array elements :");
        for(i=0;i<n;i++)
        {
            ar[i]=obj.nextInt();
        }
        obj.close();
        System.out.print("Before Sorting: ");
        for(i=0;i<n;i++)
        {
            System.out.print(ar[i]+" ");
        }
        System.out.println();
        System.out.print("After Sorting: ");
        for(i=0;i<n-1;i++)
        {
            index=i;
            for(j=i+1;j<n   ;j++)
            {
                if(ar[j]<ar[index])
                {
                    index=j;
                }
            }
            temp=ar[index];
            ar[index]=ar[i];
            ar[i]=temp;
        }
        for(i=0;i<n;i++)
        {
            System.out.print(ar[i]+" ");
        }
    }
}