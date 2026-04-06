import java.util.Scanner;

public class Areaofatriangle{
public static void main(String[]args){
Scanner input = new Scanner(System.in);

System.out.println("Enter the base of the triangle");
double base = input.nextDouble();

System.out.println("Enter the height of the triangle");
double height = input.nextDouble();

//area= 1/2 × b × h
double area = 0.5 * base * height;

System.out.printf("The area is %.1f%n", area);

}
}
