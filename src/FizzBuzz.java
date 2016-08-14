/*Program to create fizzbuzz sequence for numbers from 1 to 100 */
public class FizzBuzz {
    public static void main(String args[])
    {
for(int i=1;i<=100;i++)
    System.out.println(fizzBuzz(i));
    }
    private static String fizzBuzz(int n)
    {
        if(n%3==0&&n%5==0)
            return "FizzBuzz";
        else if(n%3==0)
            return "Fizz";
        else if(n%5==0)
            return "Buzz";
        else return Integer.toString(n);
    }
}