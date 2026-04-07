import java.util.Scanner;

public class Weightdeterminer{
public static void main(String[]args){
Scanner input = new Scanner(System.in);

System.out.println("Enter the weight in KG");
double weight = input.nextDouble();

System.out.println("Enter the height in meters");
double height = input.nextDouble();


//bmi = weight divided by heightsqr (before Mr E.O.B go ask how you calculate bmi leeemao)

double bmi = weight / Math.pow(height,2);


System.out.printf("YOUR BMI is %f%n", bmi);

if(bmi < 18.5){
System.out.println("You are UNDERWEIGHT");
}
else if (bmi >= 18.5 && bmi < 25){
System.out.println("You are NORMAL");
}
else if (bmi >= 25 && bmi < 30){
System.out.println("You are OVERWEIGHT");
}
else if (bmi >= 30 && bmi < 999){
System.out.println("You are OBESE");
}

}
}



