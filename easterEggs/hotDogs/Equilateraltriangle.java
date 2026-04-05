import java.util.Scanner;

public class Equilateraltriangle{
public static void main(String[]args){
Scanner input = new Scanner(System.in);

System.out.println("What is the length");
double length = input.nextDouble();

double area = (Math.sqrt(3) /4) * (length * length);

System.out.printf("The area of the Equilateral triangle is %f%n", area);

}
}
