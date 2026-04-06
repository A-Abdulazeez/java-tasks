import java.util.Scanner;

public class Compoundinterest{
public static void main(String[]args){
Scanner input = new Scanner(System.in);

System.out.println("Enter the principal");
double principal = input.nextDouble();

System.out.println("Enter the rate");
double rate = input.nextDouble();

System.out.println("Enter the time");
double time = input.nextDouble();

double simpleinterest = principal * rate * time;

int n = 12;
//n=Compounding Frequency and can be days,month, or years so i used 12 months 

double compoundinterest = principal * Math.pow(1 + rate/n,time);

System.out.printf("The simple interest is %f%n", simpleinterest);
System.out.printf("The compound interest is %f%n", compoundinterest); 

}
}
