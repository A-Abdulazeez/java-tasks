import java.util.Scanner;

public class Surfacearea{
public static void main(String[]args){
Scanner input = new Scanner(System.in);

System.out.println("Enter the radius of the cylinder");
double radius = input.nextDouble();

System.out.println("Enter the height of the cylinder");
double height = input.nextDouble();

//surfacearea =2πrh+2πr2 , volume =πr2h
double surfacearea = (2 * Math.PI * radius * height) + (2 * Math.PI * Math.pow(radius,2));

double volume = Math.PI * Math.pow(radius,2) * height;

System.out.printf("The surface area is %f%n", surfacearea);
System.out.printf("The volume is %f%n", volume);

}
}



