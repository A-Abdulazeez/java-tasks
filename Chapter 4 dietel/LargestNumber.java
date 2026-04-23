import java.util.Scanner;

public class LargestNumber {
public static void main(String[] args) {
Scanner input = new Scanner(System.in);

int counter = 1;
int userNumber;
int largestNumber = 0;

System.out.print("Enter a number 1: ");
largestNumber = input.nextInt();

while (counter <= 9) {
System.out.printf("Enter a number %d: ", counter + 1);
userNumber = input.nextInt();

if (userNumber > largestNumber) {
largestNumber = userNumber;
}

counter++;
 }

System.out.printf("Largest number is %d%n", largestNumber);
}
}
