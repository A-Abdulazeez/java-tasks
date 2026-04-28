import java.util.Scanner;

public class LargestNumberTwo{
public static int LargestNumber(    ) {
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
return largestNumber;
}
public static void main(String[] args) {
}
}
