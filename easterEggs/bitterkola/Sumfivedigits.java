import java.util.Scanner;

public class Sumfivedigits{
public static void main(String[]args){
Scanner input = new Scanner(System.in);

System.out.println("Enter a five digit number");
int number = input.nextInt();

int firstdigit = number % 10;

int lastdigit = number / 10000;

int sum = firstdigit + lastdigit;

System.out.println("The sum of the first and last digits is " + sum);

}
}

