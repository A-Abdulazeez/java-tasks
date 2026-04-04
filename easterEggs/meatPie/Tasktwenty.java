import java.util.Scanner;

public class Tasktwenty{
public static void main(String[]args){
Scanner input = new Scanner(System.in);

System.out.println("What is your length");
float length = input.nextFloat();

System.out.println("What is your width");
float width = input.nextFloat();

float area = length*width;

System.out.printf("The area is %f%n", area);

}
}
