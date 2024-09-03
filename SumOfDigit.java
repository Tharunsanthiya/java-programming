//This program sum the all digits in a number
import java.util.*;
public class SumOfDigit 
{
    public static void main(String args[])
    {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n=obj.nextInt(),s=0;
        obj.close();
        while(n>0)
        {
            s+=n%10;
            n/=10;
        }
        System.out.println(s);
    }    
}
