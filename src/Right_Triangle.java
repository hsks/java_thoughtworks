/**
 * Created by harsh on 12/8/16.
 */
import java.util.*;
public class Right_Triangle {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=0,temp=0;
        System.out.println("Enter n");
        n=sc.nextInt();
        while(temp<n)
        {
            int i=0;
            while(i<=temp)
            {
                System.out.print("*");
                i++;
            }
            System.out.println("");
            temp++;
        }
    }
}
