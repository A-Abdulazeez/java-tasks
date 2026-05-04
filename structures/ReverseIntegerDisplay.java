import java.util.Scanner;

public class ReverseIntegerDisplay {
    public static void reverse(int number) {
        if (number < 0) {
            System.out.print("-");
            number = Math.abs(number);
        }

        while (number != 0) {
            System.out.print(number % 10);
            number /= 10;
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int number = input.nextInt();

        System.out.print("The reversed number is ");
        reverse(number);
        System.out.println();
    }
}
