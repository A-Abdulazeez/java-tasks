import java.util.Scanner;

public class Triangledeterminer{
public static void main(String[]args){
Scanner input = new Scanner(System.in);

System.out.println("Enter the first side:");
double first = input.nextDouble();

System.out.println("Enter the second side:");
double second = input.nextDouble();

System.out.println("Enter the third side:");
double third = input.nextDouble();

if(first == second && second == third){
System.out.println("The triangle is an EQUILATERAL triangle");
}

if(first == second && second != third){
System.out.println("The triangle is an ISOSCELES triangle");
}

if(first != second && second != third && first != third){
System.out.println("The triangle is an SCALENE triangle");
}

}
}
