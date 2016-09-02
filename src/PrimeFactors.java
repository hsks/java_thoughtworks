/**
 * Created by harsh on 15/8/16.
 */
import java.util.*;
public class PrimeFactors {
 /*   public static void main(String args[])
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

    }*/
    public ArrayList<Integer> generate(int n) {
        ArrayList <Integer> ar=new ArrayList<Integer>();
        PrimeFactors obj = new PrimeFactors();
        for (int i = 2; i <= n / 2; i++) {
            if ((n%i == 0) && obj.isPrime(i))
                ar.add(i);
        }
        if(ar.isEmpty())
            ar.add(n);
        return ar;
    }

    private boolean isPrime(int n) {
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }
}
