import java.util.Scanner;

public class Pincode{
public static void main(String[]args){
Scanner input = new Scanner(System.in);

System.out.println("Enter your four digit pin");
int pin = input.nextInt();

if(pin == 6813){
System.out.println("Valid Pin");
}
else if(pin != 6813){
System.out.println("Invalid Pin");
}

}
}
