/**
 * Created by harsh on 2/9/16.
 */
import java.util.Scanner;
public class TestVerticalAsterisk {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter n");
        int n=sc.nextInt();
        Vertical_Asterisk.drawPattern(n);
    }
}
