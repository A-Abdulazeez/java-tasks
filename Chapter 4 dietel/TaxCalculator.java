import java.util.Scanner;

public class TaxCalculator {
public static void main(String[] args) {
Scanner input = new Scanner(System.in);

int citizen = 1;
while (citizen <= 3){
citizen++;

System.out.println("whats your name");
String userName = input.next();

System.out.println("Enter yearly earnings: ");
double userEarnings = input.nextDouble();

double totalTax;

if (userEarnings <= 30000) {
totalTax = userEarnings * 0.15;
}
else{
totalTax = userEarnings * 0.20;
 }

System.out.printf("%s total tax: %.2f%n%n", userName, totalTax);
}
}
}
