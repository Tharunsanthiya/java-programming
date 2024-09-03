//This program finds the maximum element in a array without using Buildin function
import java.util.*;
public class MaxElementMAX
{
    public static void main(String args[])
    {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the array size");
        int i,n=obj.nextInt(),max=0;
        int ar[]=new int[n];
        System.out.println("Enter the array elements :");
        for(i=0;i<n;i++)
        {
            ar[i]=obj.nextInt();
            if(max<ar[i])
                max=ar[i];
        }
        obj.close();
        System.out.println(max+" is the maximum element...");
    }
}
