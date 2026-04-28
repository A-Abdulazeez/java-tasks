import java.util.Scanner;

public class OddNumbersArray{
public static void main(String[] args) {
Scanner input = new Scanner(System.in);

int[] array = new int[10];
for (int count = 0; count < 10; count++) {
System.out.print("Enter a number: ");
int userInput = input.nextInt();
array[count] = userInput;
}

System.out.print("odd numbers: ");
for (int index = 0; index < array.length; index++) {
if (array[index] % 2 == 1) {
System.out.print(array[index] + " ");
  }
}
System.out.println();
 }
}
