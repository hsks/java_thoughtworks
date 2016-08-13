/*Program to create an isoscles triangle, given n*/
import java.util.*;
public class Isoscles {
    public static void main(String args[]) {
        int n ;
        System.out.println("Enter n");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("");
            for (int j = n-i; j > 0; j--) {
                System.out.print(" ");
            }
            for (int k = 0; k < 2 * i + 1; k++) {
                System.out.print("*");
            }
        }
    }
}