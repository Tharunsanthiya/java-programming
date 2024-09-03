//This program finds the maximum element in a array using Buildin function
import java.util.*;
public class MaxElement
{
    public static void main(String args[])
    {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the array size");
        int i,n=obj.nextInt();
        int ar[]=new int[n];
        System.out.println("Enter the array elements :");
        for(i=0;i<n;i++)
        {
            ar[i]=obj.nextInt();
        }
        obj.close();
        Arrays.sort(ar);
        System.out.println(ar[n-1]+" is the maximum element...");
    }
}
