import java.util.Scanner;
/**
 * Created by harsh on 2/9/16.
 */
public class TestRightTriangle {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=0;
        System.out.println("Enter n");
        n=sc.nextInt();
        Right_Triangle.drawTriangle(n);
    }
}
