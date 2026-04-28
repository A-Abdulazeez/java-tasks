import java.util.Scanner;

public class EvenNumbersArray{
public static void main(String[] args) {
Scanner input = new Scanner(System.in);

int[] array = new int[10];
for (int count = 0; count < 10; count++) {
System.out.print("Enter a number: ");
int userInput = input.nextInt();
array[count] = userInput;
}

System.out.print("Even numbers: ");
for (int index = 0; index < array.length; index++) {
if (array[index] % 2 == 0) {
System.out.print(array[i] + " ");
  }
}
System.out.println();
 }
}
