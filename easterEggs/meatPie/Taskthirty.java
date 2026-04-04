import java.util.Scanner;

public class Taskthirty{
public static void main(String[]args){
Scanner input = new Scanner(System.in);

System.out.println("What is your first number");
int x = input.nextInt();

System.out.println("What is your second number");
int y = input.nextInt();

int sum = x+y;

int product = x*y;

System.out.printf("The sum of your number is %d%n", sum);

System.out.printf("The product of your number is %d%n", product);

}
}
