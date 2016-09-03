/**
 * Created by harsh on 2/9/16.
 */
import java.util.Scanner;
public class TestCenteredDiamond {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter n");
        int n=sc.nextInt();
        Centered_Diamond.drawDiamond(n);
    }
}
