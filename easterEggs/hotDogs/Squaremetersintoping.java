import java.util.Scanner;

public class Squaremetersintoping{
public static void main(String[]args){
Scanner input = new Scanner(System.in);

System.out.println("Enter a number in square meters");
double squaremeters = input.nextDouble();

double ping = squaremeters * 0.3025;

System.out.printf("The equivalent in ping is %f%n", ping);


}
}
