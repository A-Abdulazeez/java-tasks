import java.util.Scanner;

public class GasPerMileage{
public static void main(String[] args) {
Scanner input = new Scanner(System.in);

int userMiles;
int gasGallons;
int totalMiles = 0;
int totalGallons = 0;

System.out.print("Enter miles driven (-1 to quit): ");
userMiles = input.nextInt();

while (userMiles != -1) {
System.out.print("Enter gallons used: ");
gasGallons = input.nextInt();

totalMiles += userMiles;
totalGallons += gasGallons;

double milesPerGallon = (double) userMiles / gasGallons;
double totalMilesPerGallon = (double) totalMiles / totalGallons;

System.out.printf("Miles per gallon for this trip: %.2f%n", milesPerGallon);
System.out.printf("Combined miles per gallon: %.2f%n%n", totalMilesPerGallon);

System.out.print("Enter miles driven (-1 to quit): ");
userMiles = input.nextInt();
        }
    }
}
