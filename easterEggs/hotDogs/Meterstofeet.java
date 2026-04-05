import java.util.Scanner;

public class Meterstofeet{
public static void main(String[]args){
Scanner input = new Scanner(System.in);

System.out.println("Enter a number in meters");
double meters = input.nextDouble();

double feet = meters * 3.2786;

System.out.printf("The equivalent in feet is %f%n", feet);


}
}
