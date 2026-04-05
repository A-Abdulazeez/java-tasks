import java.util.Scanner;

public class Distance{
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

double xsqr = Math.pow(xtwo-xone,2);

double ysqr = Math.pow(ytwo-yone,2);

double distance = Math.sqrt(xsqr+ysqr);

System.out.printf("The distance is %f%n", distance);

}
}



