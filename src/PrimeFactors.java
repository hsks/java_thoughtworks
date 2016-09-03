/*
 * Created by harsh on 15/8/16.
 */
import java.util.*;
public class PrimeFactors {
    public static ArrayList<Integer> generate(int n) {
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
