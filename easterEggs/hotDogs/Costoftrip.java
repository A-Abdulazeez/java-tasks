import java.util.Scanner;

public class Costoftrip{
public static void main(String[]args){
Scanner input = new Scanner(System.in);

System.out.println("The distance to drive");
double distance = input.nextDouble();

System.out.println("Car fuel efficiency in miles per gallon");
double fueleff = input.nextDouble();

System.out.println("The price per gallon");
double price = input.nextDouble();

double cost = (distance / fueleff) * price;

System.out.printf("The cost of the trip is %f%n", cost);

}
}
