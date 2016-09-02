/**
 * Created by harsh on 2/9/16.
 */
import java.util.Scanner;
public class TestSingleLine {
    public static void main(String args[])
    {
        Single_line obj=new Single_line();
        Scanner sc=new Scanner(System.in);
        int n=0;
        System.out.println("Enter n");
        n=sc.nextInt();
        obj.drawLine(n);
    }
}
