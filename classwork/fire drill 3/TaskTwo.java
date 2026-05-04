import java.util.Scanner;

public class TaskTwo {
public static void main(String... args) {
Scanner input = new Scanner(System.in);

int[] scores = new int[10];
int count = 0; 
while (count < scores.length) {
System.out.println("Enter a number");
int userInput = input.nextInt();
scores[count] = userInput;
count++;
}
System.out.println(); 

for (int index = 0; index < scores.length; index++) {
System.out.println(scores[index] + " ");
}
System.out.println(); 
    }
}
