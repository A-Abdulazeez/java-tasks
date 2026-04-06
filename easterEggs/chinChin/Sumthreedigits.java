import java.util.Scanner;

public class Sumthreedigits{
public static void main(String[] args) {
Scanner input = new Scanner(System.in);

System.out.println("Enter a number between 0 and 1000");
int number = input.nextInt();

int firstdigit = number % 10;

int seconddigit = (number/10) % 10;

int thirddigit = number / 100;

int sum = firstdigit + seconddigit + thirddigit;

System.out.println("The sum of the digits is " + sum);

}
}
