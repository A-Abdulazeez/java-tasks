import java.util.Scanner;

public class Minutesconverter{
public static void main(String[]args){
Scanner input = new Scanner(System.in);

System.out.println("Enter the number of minutes");
int minutes = input.nextInt();

int days = minutes / 1440; 
int hours = minutes / 60;
int remainingminutes = minutes % 60;

System.out.printf("%d Minutes is %d days and %d hours and %d remaining minutes%n", minutes,days,hours,remainingminutes);

}
}
