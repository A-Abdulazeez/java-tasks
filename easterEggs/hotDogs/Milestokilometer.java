import java.util.Scanner;

public class Milestokilometer{
public static void main(String[]args){
Scanner input = new Scanner(System.in);

System.out.println("Enter a number in miles");
double miles = input.nextDouble();

double kilometers = miles * 1.6;

System.out.printf("The equivalent in Kilometers is %f%n", kilometers);


}
}
