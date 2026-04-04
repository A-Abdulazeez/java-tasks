import java.util.Scanner;

public class Taskfourteen{
public static void main(String[]args){
Scanner Number = new Scanner(System.in);

System.out.println("Enter your first number");
int num1 = Number.nextInt();

System.out.println("Enter your second number");
int num2 = Number.nextInt();

System.out.println("Enter your third number");
int num3 = Number.nextInt();

int avg = (num1+num2+num3)/3;

System.out.printf("The average is %d%n", avg);

}
}
