import java.util.Scanner;

public class SortedNumbers {
    public static void displaySortedNumbers(double num1, double num2, double num3) {
        double smallest = Math.min(num1, Math.min(num2, num3));
        double largest = Math.max(num1, Math.max(num2, num3));
        double middle = num1 + num2 + num3 - smallest - largest;

        System.out.println(largest + " " + middle + " " + smallest);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter three numbers: ");
        double num1 = input.nextDouble();
        double num2 = input.nextDouble();
        double num3 = input.nextDouble();

        System.out.print("Numbers in decreasing order: ");
        displaySortedNumbers(num1, num2, num3);
    }
}
