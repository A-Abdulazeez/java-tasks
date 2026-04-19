import java.util.Scanner;

public class AverageOfPositive{
public static void main(String[]args) {
Scanner input = new Scanner(System.in);

int numberInput = 0;
int sumOfPositive = 0;
int count = 0;

while (numberInput >= 0){
System.out.print("Enter a number (negative to stop): ");
numberInput = input.nextInt();

if (numberInput < 0) {
	break;
}

sumOfPositive += numberInput;
count++;
}

if (count > 0) {
double average = (double) sumOfPositive / count;
System.out.println("Average: " + average);
 } 

}
}