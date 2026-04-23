import java.util.Scanner;

public class CreditLimitCalculator {
public static void main(String[] args) {
Scanner input = new Scanner(System.in);

System.out.print("Enter account number (-1 to quit): ");
int accountNumber = input.nextInt();

while (accountNumber != -1) {
System.out.print("Enter beginning balance: ");
float beginningBalance = input.nextFloat();

System.out.print("Enter total of items charges: ");
float charges = input.nextFloat();

System.out.print("Enter total credits applied: ");
float credits = input.nextFloat();

System.out.print("Enter credit limit: ");
float creditLimit = input.nextFloat();

float newBalance = beginningBalance + charges - credits;

System.out.printf("New balance: %f%n", newBalance);

if (newBalance > creditLimit) {
System.out.println("Credit limit exceeded");
}

System.out.print("\nEnter account number (-1 to quit): ");
accountNumber = input.nextInt();
}
}
}
