import java.util.Scanner;

public class Monthlyinterest{
public static void main(String[]args){
Scanner input = new Scanner(System.in);

System.out.println("Enter the Balance");
double balance = input.nextDouble();

System.out.println("Enter the Annual percentage rate");
double interest = input.nextDouble();

double monthlyinterest= balance * (interest/1200);

System.out.printf("Your monthly interest is %f%n", monthlyinterest);

}
}
