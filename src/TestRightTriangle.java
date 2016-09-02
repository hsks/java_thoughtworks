import java.util.Scanner;
/**
 * Created by harsh on 2/9/16.
 */
public class TestRightTriangle {
    public static void main(String args[])
    {
        Right_Triangle obj=new Right_Triangle();
        Scanner sc=new Scanner(System.in);
        int n=0;
        System.out.println("Enter n");
        n=sc.nextInt();
        obj.drawTriangle(n);
    }
}
