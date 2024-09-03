import java.util.*;
public class max
{
    public static void main(String args[])
    {
        Scanner obj=new Scanner(System.in);
        String s=obj.nextLine();
        // obj.close();
        int i,j,max=0;
        char ch=' ';
        for(i=0;i<s.length();i++);
        {
            int ct=0;
            for(j=0;j<s.length();j++)
            {
                if(s.charAt(i)==s.charAt(j))
                {
                        ct++;
                }
            } //  vimalanathan
            if(ct>=max && ch!=s.charAt(i))
            {
                max=ct;
                ch=s.charAt(i);
            }
        }
        System.out.println(ch+" occurs "+max+" this times...");
    }   
}