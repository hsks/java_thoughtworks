/**
 * Created by harsh on 2/9/16.
 */
import java.util.Scanner;
public class TestCenteredDiamond {
    public static void main(String args[])
    {
        Centered_Diamond obj=new Centered_Diamond();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter n");
        int n=sc.nextInt();
        obj.drawDiamond(n);
    }
}
