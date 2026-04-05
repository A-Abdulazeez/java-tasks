import java.util.Scanner;

public class Energyneededtoheatwater{
public static void main(String[]args){
Scanner input = new Scanner(System.in);

System.out.println("Enter amount of water in Kg:");
double kilogram = input.nextDouble();

System.out.println("Enter the initial temperature in °C:");
double initialtemp = input.nextDouble();

System.out.println("Enter the final temperature in °C:");
double finaltemp = input.nextDouble();

double energyneeded = kilogram * (finaltemp - initialtemp) * 4184;

System.out.printf("The energy needed to heat water from its initial temerature to final temperature is  %fJ%n", energyneeded);

}
}

