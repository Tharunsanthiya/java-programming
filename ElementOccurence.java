//This program prints the occurrence of each element in an array
import java.util.*;
public class ElementOccurence 
{
    public static void main(String args[])
    {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the array size :");
        int i=0,j,n=obj.nextInt(),ar[]=new int[n];
        System.out.println("Enter the array element :");
        for(i=0;i<n;i++)
            ar[i]=obj.nextInt();
        for(i=0;i<n;i++)
        {
            int ct=0;
            for(j=0;j<n;j++)
            {
                if(ar[i]==ar[j])
                    ct++;
            }
            System.out.println(ar[i]+" is occured "+ct+" times.");
        }
    }   
}