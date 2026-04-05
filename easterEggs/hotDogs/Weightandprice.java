import java.util.Scanner;
public class Weightandprice{
public static void main(String[]args){
Scanner input = new Scanner(System.in);

System.out.println("Input the price of the first rice");
double ricepriceone = input.nextDouble();

System.out.println("Input the weight of the first rice");
double riceweightone = input.nextDouble();

System.out.println("Input the price of the second rice");
double ricepricetwo = input.nextDouble();

System.out.println("Input the weight of the second rice");
double riceweighttwo = input.nextDouble();

double totalone = ricepriceone / riceweightone;

double totaltwo = ricepricetwo / riceweighttwo;

if (totalone > totaltwo) {
System.out.printf("The better rice is the first one%n");

}
else{
System.out.printf("The better rice is the second one%n");
}

}
}
