import java.util.*;
public class Right_Triangle {
    public static void drawTriangle(int n) {
        int temp = 0;
        while (temp < n) {
            int i = 0;
            while (i <= temp) {
                System.out.print("*");
                i++;
            }
            System.out.println("");
            temp++;
        }
    }
}