import java.util.Scanner;

public class SumDigits {
    public static int sumDigits(long n) {
        n = Math.abs(n);
        int sum = 0;

        while (n != 0) {
            sum += n % 10;
            n /= 10;
        }

        return sum;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        long number = input.nextLong();

        System.out.println("The sum of the digits is " + sumDigits(number));
    }
}
