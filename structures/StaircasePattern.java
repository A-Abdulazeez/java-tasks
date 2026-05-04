import java.util.Scanner;

public class StaircasePattern {
    public static void displayPattern(int n) {
        for (int row = 1; row <= n; row++) {
            for (int space = n - row; space > 0; space--) {
                System.out.print("  ");
            }

            for (int number = row; number >= 1; number--) {
                System.out.print(number + " ");
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter n: ");
        int number = input.nextInt();

        displayPattern(number);
    }
}
