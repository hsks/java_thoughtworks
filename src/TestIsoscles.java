/**
 * Created by harsh on 2/9/16.
 */
import java.util.Scanner;
public class TestIsoscles {
    public static void main(String args[])
    {
        Isoscles obj=new Isoscles();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter n");
        int n=sc.nextInt();
        obj.drawTriangle(n);
    }
}
