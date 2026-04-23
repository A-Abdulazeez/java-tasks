import java.util.Scanner;

public class ValidatingUserInput{
public static void main(String[] args) {
Scanner input = new Scanner(System.in);

int result;

System.out.print("Enter result (1 = pass, 2 = fail): ");
result = input.nextInt();

while (result != 1 && result != 2) {
System.out.print("Invalid input. Enter 1 = pass or 2 = fail: ");
result = input.nextInt();
}

if (result == 1) {
System.out.println("Passed");
} 
else {
System.out.println("Failed");
}

}
}
