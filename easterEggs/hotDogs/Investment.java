import java.util.Scanner;

public class Investment{
public static void main(String[]args){
Scanner input = new Scanner(System.in);

System.out.println("Enter the investment amount");
double investment = input.nextDouble();

System.out.println("Enter the annual interest rate");
double interest = input.nextDouble();

double monthlyinterest = interest/100/12;

System.out.println("Enter the number of years");
double years = input.nextDouble();

double futureinvestmentvalue = investment * Math.pow(1+ monthlyinterest,years * 12);


System.out.printf("The future investment value is %f%n", futureinvestmentvalue);

}
}
