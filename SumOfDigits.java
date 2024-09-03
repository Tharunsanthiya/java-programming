//This program sums the number until it becomes single digit
import java.util.*;
public class SumOfDigits
{
    public static void main(String args[])
    {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter a number to sum :");
        int n=obj.nextInt(),k;
        obj.close();
        k=sum(n);
        while(k>9)
            k=sum(k);
        System.out.println(k);
    }
    static int sum(int n)
    {
        int s=0;
        while(n>0)
        {
            s+=n%10;
            n/=10;
        }
        return s;
    }
}