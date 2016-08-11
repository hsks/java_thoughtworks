/**
 * Created by harsh on 12/8/16.
 */
import java.util.*;
public class Single_line {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=0;
        System.out.println("Enter n");
        n=sc.nextInt();
        while(n>0)
        {
            System.out.print("*");
            n--;
        }
    }
}
