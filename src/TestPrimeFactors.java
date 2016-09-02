import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by harsh on 2/9/16.
 */
public class TestPrimeFactors {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.println("Enter the number");
        n=sc.nextInt();
        PrimeFactors obj=new PrimeFactors();
        ArrayList ar=obj.generate(n);
        for(int i=0;i<ar.size();i++)
        {
            System.out.println(ar.get(i));
        }
    }
}
