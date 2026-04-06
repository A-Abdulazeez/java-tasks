import java.util.Scanner;

public class MinutesToYears{
public static void main(String[]args){
Scanner input = new Scanner(System.in);

System.out.println("Enter the number of minutes");
int minutes = input.nextInt();

int days = minutes / 1440; 
int years = days / 365;
int remainingdays = days % 365;

System.out.printf("%d Minutes is %d Years and %d RemainingDays%n", minutes, years, remainingdays);

}
}
