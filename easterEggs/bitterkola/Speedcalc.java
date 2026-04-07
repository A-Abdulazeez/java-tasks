import java.util.Scanner;

public class Speedcalc{
public static void main(String[]args){
Scanner input = new Scanner(System.in);

System.out.println("Enter the speed in KM/H");
double speed = input.nextDouble();


if(speed == 0){
System.out.println("Stationary");
}
else if (speed >= 1 && speed < 41){
System.out.println("Slow");
}
else if (speed >= 41 && speed < 81){
System.out.println("Moderate");
}
else if (speed >= 81 && speed < 121){
System.out.println("Fast");
}
else if (speed >= 120 && speed < 999){
System.out.println("Dangerously fast");
}

}
}

