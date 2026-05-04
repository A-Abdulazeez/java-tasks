import java.util.Scanner;

public class FutureInvestmentValue {
    public static double futureInvestmentValue(double investmentAmount, double monthlyInterestRate, int years) {
        return investmentAmount * Math.pow(1 + monthlyInterestRate, years * 12);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter investment amount: ");
        double investmentAmount = input.nextDouble();

        System.out.print("Enter annual interest rate in percentage: ");
        double annualInterestRate = input.nextDouble();

        double monthlyInterestRate = annualInterestRate / 1200;

        System.out.println("Years    Future Value");
        for (int year = 1; year <= 30; year++) {
            System.out.printf("%-8d %.2f%n", year, futureInvestmentValue(investmentAmount, monthlyInterestRate, year));
        }
    }
}
