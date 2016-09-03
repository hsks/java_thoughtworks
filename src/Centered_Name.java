/*Program to print name on center line of a centered diamond*/
import java.util.Scanner;
public class Centered_Name {
    public static void drawDiamond(int n)
    {
        for(int i=0;i<n;i++)
        {
            System.out.println("");
            for(int j=n-i;j>0;j--)
                System.out.print(" ");
            if(i!=n-1)
            {
                for (int k = 0; k < 2 * i + 1; k++)
                    System.out.print("*");
            }
            else
                System.out.print("Harsh S. Kulshrestha");
        }
        for(int i=n-2;i>=0;i--)
        {
            System.out.println("");
            for(int j=n-i;j>0;j--)
                System.out.print(" ");
            for(int k=0;k<2*i+1;k++)
                System.out.print("*");
        }
    }
}
