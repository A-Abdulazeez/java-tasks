import java.util.Scanner;

public class Palindrome{
public static void main(String[] args) {
Scanner input = new Scanner(System.in);

int userNumber=0;

while (true) {
System.out.print("Enter a five-digit number: ");
userNumber = input.nextInt();

if (userNumber >= 10000 && userNumber <= 99999) {
break;
}

System.out.println("Error: Number must be five digits.");
 }

int firstNumber = userNumber / 10000;
int secondNumber = (userNumber / 1000) % 10;
int fourthNumber = (userNumber / 10) % 10;
int fifthNumber = userNumber % 10;

if (firstNumber == fifthNumber && secondNumber == fourthNumber) {
System.out.println("It is a palindrome.");
} 
else {
System.out.println("It is not a palindrome.");

}
}
}
