import java.util.Scanner;

public class Threepointofatriangle{
public static void main(String[]args){
Scanner input = new Scanner(System.in);

System.out.println("Enter the x1");
double xone = input.nextDouble();

System.out.println("Enter the y1");
double yone = input.nextDouble();

System.out.println("Enter the x2");
double xtwo = input.nextDouble();

System.out.println("Enter the y2");
double ytwo = input.nextDouble();

System.out.println("Enter the x3");
double xthree = input.nextDouble();

System.out.println("Enter the y3");
double ythree = input.nextDouble();

double sideone = Math.sqrt(Math.pow(xtwo-xone,2) + Math.pow(ytwo-yone,2));

double sidetwo = Math.sqrt(Math.pow(xthree-xtwo,2) + Math.pow(ythree-ytwo,2));

double sidethree = Math.sqrt(Math.pow(xthree-xone,2) + Math.pow(ythree-yone,2));

double s = (sideone + sidetwo + sidethree) / 2;

double area = Math.sqrt(s * (s-sideone) * (s-sidetwo) * (s-sidethree));


System.out.printf("The Area of the triangle is %f%n", area);

}
}

