import java.util.Scanner;

public class Bmicalculator{
public static void main(String[]args){
Scanner input = new Scanner(System.in);

System.out.println("Enter the weight in pounds");
double pounds = input.nextDouble();

System.out.println("Enter the height in inches");
double inches = input.nextDouble();

double poundsconvrtokg = pounds * 0.45359237;

double inchesconvrtometers = inches * 0.0254;

//bmi = weight divided by heightsqr (before Mr E.O.B go ask how you calculate bmi leeemao)

double bmi = poundsconvrtokg / (inchesconvrtometers*inchesconvrtometers);


System.out.printf("The BMI is %f%n", bmi);

}
}



